package main.java.com.timon1983.Patterns.Bridge;

public abstract class Building {

    protected Worker worker;

    protected Building(Worker worker) {
        this.worker = worker;
    }

    public abstract void build();
}
