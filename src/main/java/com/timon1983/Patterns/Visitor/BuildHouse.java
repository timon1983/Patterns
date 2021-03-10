package main.java.com.timon1983.Patterns.Visitor;

public class BuildHouse implements Work{
    @Override
    public void doWork(Worker worker) {
        worker.startWork(this);
    }
}
