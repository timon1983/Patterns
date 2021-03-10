package main.java.com.timon1983.Patterns.FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        WorkerFactory workerFactory = getWorkerFactoryByWorkObject("pipe");
        Worker worker = workerFactory.createWorker();
        worker.doWork();
    }

    static WorkerFactory getWorkerFactoryByWorkObject(String workObject){
        if (workObject.equalsIgnoreCase("stone")){
            return new MasonFactory();
        } else if (workObject.equalsIgnoreCase("roof")){
            return new RooferFactory();
        } else if (workObject.equalsIgnoreCase("electricity")){
            return new ElectricianFactory();
        } else if (workObject.equalsIgnoreCase("pipe")){
            return new PlumberFactory();
        } else throw new RuntimeException(workObject + " don`t do it.");
    }
}
