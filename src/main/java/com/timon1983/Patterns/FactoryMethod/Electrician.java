package main.java.com.timon1983.Patterns.FactoryMethod;

public class Electrician implements Worker{
    @Override
    public void doWork() {
        System.out.println("Монтаж электроснабжения");
    }
}
