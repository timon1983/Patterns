package main.java.com.timon1983.Patterns.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Worker worker = new ManagerMason(new MasterMason(new Mason()));
        worker.doWork();
    }
}
