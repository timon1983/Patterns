package main.java.com.timon1983.Patterns.Strategy;

public class MakingElectricity implements Working {
    @Override
    public void doWork() {
        System.out.println("making electricity");
    }
}
