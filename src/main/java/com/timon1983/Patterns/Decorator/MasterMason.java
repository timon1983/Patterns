package main.java.com.timon1983.Patterns.Decorator;

public class MasterMason extends DecoratorWorker {

    public MasterMason(Worker worker) {
        super(worker);
    }

    void chekWork(){
        System.out.print("Проверяет работу.");
    }

    @Override
    public void doWork() {
        super.doWork();
        chekWork();
    }
}
