package main.java.com.timon1983.Patterns.Bridge;

public class Mason implements Worker{

    @Override
    public void doWork() {
        System.out.println("Каменщик строит дом");
    }
}
