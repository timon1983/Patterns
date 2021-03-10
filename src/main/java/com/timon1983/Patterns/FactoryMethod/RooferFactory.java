package main.java.com.timon1983.Patterns.FactoryMethod;

public class RooferFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new Roofer();
    }
}
