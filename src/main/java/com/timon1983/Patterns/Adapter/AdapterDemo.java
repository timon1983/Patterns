package main.java.com.timon1983.Patterns.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Human human = new StudentAdaptToHuman();
        human.isStudying();
        human.resting();
        human.doWork();
        human.sleeping();
    }
}
