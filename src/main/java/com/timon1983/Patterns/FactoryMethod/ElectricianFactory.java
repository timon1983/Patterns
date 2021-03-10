package main.java.com.timon1983.Patterns.FactoryMethod;

public class ElectricianFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new Electrician();
    }
}
