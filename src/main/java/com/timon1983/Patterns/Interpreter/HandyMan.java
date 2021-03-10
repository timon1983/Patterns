package main.java.com.timon1983.Patterns.Interpreter;

public class HandyMan implements Expression{
    Expression expression1;
    Expression expression2;

    public HandyMan(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public String interpret(String context) {
        if (expression1.interpret(context).equals(expression2.interpret(context))) {
            return "This worker is handyman";
        }
        return "This worker doesn't handyman";
    }
}
