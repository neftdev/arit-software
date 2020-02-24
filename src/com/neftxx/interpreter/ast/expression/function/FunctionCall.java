package com.neftxx.interpreter.ast.expression.function;

import com.neftxx.interpreter.AritLanguage;
import com.neftxx.interpreter.ast.expression.Expression;
import com.neftxx.interpreter.ast.scope.Scope;
import com.neftxx.interpreter.ast.statement.native_function.NativeFunction;
import com.neftxx.util.NodeInfo;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FunctionCall extends Expression {
    public final String id;
    public final ArrayList<Expression> arguments;

    public FunctionCall(NodeInfo info, String id, ArrayList<Expression> arguments) {
        super(info);
        this.id = id;
        this.arguments = arguments;
    }

    public FunctionCall(NodeInfo info, String id) {
        this(info, id, null);
    }

    @Override
    public Object interpret(AritLanguage aritLanguage, Scope scope) {
        NativeFunction nativeFunction = aritLanguage.globalScope.getNativeFunction(this.id);
        if (nativeFunction != null) {
            this.value = nativeFunction.interpret(aritLanguage, this.arguments, scope);
            this.type = nativeFunction.type;
        } else {
            int numberOfArguments = this.arguments != null ? arguments.size() : 0;
            Function function = aritLanguage.globalScope.getMethod(this.id, numberOfArguments);
            if (function != null) {
                int i = 0;
                Expression expression;
                Scope methodScope = new Scope(aritLanguage.globalScope);
                ArrayList<FormalParameter> parameters = function.parameters;
                Object valueArgument;
                for (; i < numberOfArguments; i++) {
                    expression = this.arguments.get(i);
                    valueArgument = expression.interpret(aritLanguage, scope);
                    if (TYPE_FACADE.isUndefinedType(expression.type)) {
                        aritLanguage.addSemanticError("Error en " + this +" : al evaluar el parametro `" +
                                (i + 1) + "`.", this.info);
                        this.type = TYPE_FACADE.getUndefinedType();
                        return null;
                    } else if (TYPE_FACADE.isDefaultType(expression.type)) {
                        expression = parameters.get(i).expDefault;
                        if (expression != null) {
                            valueArgument = expression.interpret(aritLanguage, methodScope);
                            if (TYPE_FACADE.isUndefinedType(expression.type)) {
                                aritLanguage.addSemanticError("Error en " + this +" : al evaluar el parametro `" +
                                        (i + 1) + "` por defecto.", this.info);
                                this.type = TYPE_FACADE.getUndefinedType();
                                return null;
                            }
                        } else {
                            aritLanguage.addSemanticError("Error en " + this + " : la función `" +
                                            this.id + "` no tiene un valor por defecto en el parametro `" +  (i + 1) + "`.",
                                    this.info);
                            this.type = TYPE_FACADE.getUndefinedType();
                            return null;
                        }
                    }
                    methodScope.addVariable(parameters.get(i).id, expression.type, valueArgument);
                }
                this.value = function.interpret(aritLanguage, methodScope);
                this.type = function.type;
                return this.value;
            } else {
                aritLanguage.addSemanticError("Error en " + this + " : no se encuentra la función `" +
                                this.id + "` con la cantidad de argumentos `" + numberOfArguments + "`.", this.info);
                this.type = TYPE_FACADE.getUndefinedType();
                this.value = null;
                return null;
            }
        }
        return this.value;
    }

    @Override
    public void createAstGraph(@NotNull StringBuilder astGraph) {
    }

    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder(this.id + "( ");
        for (Expression argument: this.arguments) cad.append(argument).append(" ");
        return cad + ")";
    }
}