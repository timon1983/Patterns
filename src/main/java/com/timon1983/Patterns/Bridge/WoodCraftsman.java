package main.java.com.timon1983.Patterns.Bridge;

public class WoodCraftsman implements Worker{
    @Override
    public void doWork() {
        System.out.println("Мастер по дереву строит дом");
    }
}
