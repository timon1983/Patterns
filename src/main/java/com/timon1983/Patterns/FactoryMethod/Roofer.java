package main.java.com.timon1983.Patterns.FactoryMethod;

public class Roofer implements Worker{
    @Override
    public void doWork() {
        System.out.println("Монтировать крышу");
    }
}
