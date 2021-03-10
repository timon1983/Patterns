package main.java.com.timon1983.Patterns.Composite;

public class Plumber implements Worker{
    @Override
    public void doWork() {
        System.out.println("Монтаж водопровода и сантехники");
    }
}
