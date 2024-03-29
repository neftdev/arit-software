package com.neftxx.controller;

import com.neftxx.util.SyntaxUtils;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.fxmisc.wellbehaved.event.EventPattern;
import org.fxmisc.wellbehaved.event.InputMap;
import org.fxmisc.wellbehaved.event.Nodes;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntFunction;
import java.util.regex.Matcher;

public class EditorController {
    private CodeArea codeArea;
    private Label labelLineInfo;
    private ExecutorService taskExecutor;

    public EditorController(CodeArea codeArea, Label labelLineInfo) {
        this.codeArea = codeArea;
        this.labelLineInfo = labelLineInfo;
        taskExecutor = Executors.newSingleThreadExecutor();
    }

    public void editorSettings() {
        changeTabSize();
        codeAreaHighlighter();
        codeAreaAddLineNumber();
        caretLineColumn();
    }

    private void caretLineColumn() {
        this.codeArea.selectionProperty().addListener((oba, oldVal, newVal) -> {
            Platform.runLater(() -> {
                int line = codeArea.getCurrentParagraph() + 1;
                int column = codeArea.getCaretColumn() + 1;
                String format = String.format("Línea: %d | Columna: %d", line, column);
                this.labelLineInfo.setText(format);
            });
        });
    }

    private void changeTabSize() {
        InputMap<KeyEvent> im = InputMap.consume(
                EventPattern.keyPressed(KeyCode.TAB),
                e -> codeArea.replaceSelection("  ")
        );
        Nodes.addInputMap(codeArea, im);
    }

    private void codeAreaHighlighter() {
        codeArea.multiPlainChanges()
                .successionEnds(Duration.ofMillis(300))
                .supplyTask(this::computeHighlightingAsync)
                .awaitLatest(codeArea.multiPlainChanges())
                .filterMap(tryTask -> {
                    if (tryTask.isSuccess()) {
                        return Optional.of(tryTask.get());
                    } else {
                        tryTask.getFailure().printStackTrace();
                        return Optional.empty();
                    }
                })
                .subscribe(this::applyHighlighting);
    }

    private void codeAreaAddLineNumber() {
        IntFunction<Node> lineNumberFactory = LineNumberFactory.get(codeArea);
        codeArea.setParagraphGraphicFactory(lineNumberFactory);
    }

    @NotNull
    private Task<StyleSpans<Collection<String>>> computeHighlightingAsync() {
        String text = this.codeArea.getText();
        Task<StyleSpans<Collection<String>>> task = new Task<StyleSpans<Collection<String>>>() {
            @Override
            protected StyleSpans<Collection<String>> call() {
                return computeHighlighting(text);
            }
        };
        this.taskExecutor.execute(task);
        return task;
    }

    private void applyHighlighting(StyleSpans<Collection<String>> highlighting) {
        codeArea.setStyleSpans(0, highlighting);
    }

    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = SyntaxUtils.PATTERN.matcher(text);
        int lastKeywordEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();

        while (matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                            matcher.group("PAREN") != null ? "paren" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("BRACKET") != null ? "bracket" :
                                                    matcher.group("SEMICOLON") != null ? "semicolon" :
                                                            matcher.group("STRING") != null ? "string" :
                                                                    matcher.group("COMMENT") != null ? "comment" :
                                                                            matcher.group("OPERATION") != null ? "operation" :
                                                                                    matcher.group("NUMBER") != null ? "number" :
                                                                                            null; /* never happens */
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKeywordEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKeywordEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKeywordEnd);
        return spansBuilder.create();
    }
}
