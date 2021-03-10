package main.java.com.timon1983.Patterns.TemplateMethod;

public class TemplateDemo {
    public static void main(String[] args) {
        GeneralCommand workCommand = new Work();
        GeneralCommand studyCommand = new Study();

        workCommand.myDay();

        studyCommand.myDay();
    }
}
