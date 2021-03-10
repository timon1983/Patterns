package main.java.com.timon1983.Patterns.State;

public class BuildingHouse implements Working{
    @Override
    public void doWork() {
        System.out.println("building new house");
    }
}
