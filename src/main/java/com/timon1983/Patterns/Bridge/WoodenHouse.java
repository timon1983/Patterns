package main.java.com.timon1983.Patterns.Bridge;

public class WoodenHouse extends Building{

    public WoodenHouse(Worker worker) {
        super(worker);
    }

    @Override
    public void build() {
        System.out.println("Строить деревянный дом");
        worker.doWork();
    }
}
