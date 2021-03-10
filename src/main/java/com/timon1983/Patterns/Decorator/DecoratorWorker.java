package main.java.com.timon1983.Patterns.Decorator;

public class DecoratorWorker implements Worker {

    Worker worker;

    public DecoratorWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doWork() {
        worker.doWork();
    }
}
