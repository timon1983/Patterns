package main.java.com.timon1983.Patterns.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        WorkType workType = new WorkType();

        workType.setWorking(new BuildingHouse());
        workType.doWorking();

        workType.setWorking(new MakingPlumbing());
        workType.doWorking();

        workType.setWorking(new MakingElectricity());
        workType.doWorking();
    }
}
