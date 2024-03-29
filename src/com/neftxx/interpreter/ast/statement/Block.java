package com.neftxx.interpreter.ast.statement;

import com.neftxx.interpreter.AritLanguage;
import com.neftxx.interpreter.ast.AstNode;
import com.neftxx.interpreter.ast.scope.Scope;
import com.neftxx.util.NodeInfo;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Block extends AstNode {
    public final ArrayList<AstNode> astNodes;

    public Block(NodeInfo info, ArrayList<AstNode> astNodes) {
        super(info);
        this.astNodes = astNodes;
    }

    public Block(NodeInfo info) {
        this(info, null);
    }

    @Override
    public Object interpret(AritLanguage aritLanguage, Scope scope) {
        if (astNodes != null) {
            Object value;
            for (AstNode astNode : astNodes) {
                value = astNode.interpret(aritLanguage, scope);
                if (value instanceof Break || value instanceof Continue || value instanceof Return) {
                    return value;
                }
            }
        }
        return null;
    }

    @Override
    public void createAstGraph(@NotNull StringBuilder astGraph) {
        astGraph.append("\"node").append(this.hashCode()).append("\" [ label = \"Sentencias\"];\n");
        if (astNodes != null) {
            for (AstNode astNode: astNodes) {
                astNode.createAstGraph(astGraph);
                astGraph.append("\"node").append(this.hashCode()).append("\" -> \"")
                        .append("node").append(astNode.hashCode()).append("\";\n");
            }
        }
    }
}
