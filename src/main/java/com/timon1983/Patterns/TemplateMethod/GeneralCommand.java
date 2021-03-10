package main.java.com.timon1983.Patterns.TemplateMethod;

public abstract class GeneralCommand {
    void myDay(){
        System.out.println("I'm woke up");
        doSomthing();
        System.out.println("I'm went to sleep");
    }

    public abstract void doSomthing();
}
