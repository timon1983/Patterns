package main.java.com.timon1983.Patterns.Interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isHandyMan = getHandyMan();
        Expression isTypycalWorker = getTypycalWorker();

        System.out.println(isHandyMan.interpret("I need Mason and Roofer"));
        System.out.println(isTypycalWorker.interpret("I need Painter and Plasterer"));


    }
    static Expression getHandyMan(){
        Expression expression1 = new WorkerSkill("Mason");
        Expression expression2 = new WorkerSkill("Roofer");

        return new HandyMan(expression1, expression2);
    }

    static Expression getTypycalWorker(){
        Expression expression1 = new WorkerSkill("Painter");
        Expression expression2 = new WorkerSkill("Plasterer");

        return new TypycalWorker(expression1, expression2);
    }
}
