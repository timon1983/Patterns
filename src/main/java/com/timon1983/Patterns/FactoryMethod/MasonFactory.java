package main.java.com.timon1983.Patterns.FactoryMethod;

public class MasonFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new Mason();
    }
}
