package main.java.com.timon1983.Patterns.Bridge;

public class StoneHouse extends Building{

    public StoneHouse(Worker worker) {
        super(worker);
    }

    @Override
    public void build() {
        System.out.println("Строить каменный дом");
        worker.doWork();
    }
}
