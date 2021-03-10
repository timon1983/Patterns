package main.java.com.timon1983.Patterns.State;

public class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        Working working = new BuildingHouse();
        WorkType workType = new WorkType();

        workType.setWorking(working);

        for (int i = 0; i < 3; i++) {
            workType.newWorkingStage();
            Thread.sleep(1000);
        }
    }
}
