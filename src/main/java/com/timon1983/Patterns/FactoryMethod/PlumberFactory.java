package main.java.com.timon1983.Patterns.FactoryMethod;

public class PlumberFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new Plumber();
    }
}
