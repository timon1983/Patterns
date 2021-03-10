package main.java.com.timon1983.Patterns.Decorator;

public class ManagerMason extends DecoratorWorker{

    public ManagerMason(Worker worker) {
        super(worker);
    }

    void acceptJob(){
        System.out.print("Принимает работу.");
    }

    @Override
    public void doWork() {
        super.doWork();
        acceptJob();
    }
}
