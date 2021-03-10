package main.java.com.timon1983.Patterns.Interpreter;

public class WorkerSkill implements Expression{
    String skill;

    public WorkerSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String interpret(String context) {
        if (context.contains(skill)){
            return "true";
        }
        return "false";
    }
}
