package main.java.com.timon1983.Patterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();
        List<Worker> newWorkers = new ArrayList<>();

        newWorkers.add(workerFactory.getNewWorker("Stone"));
        newWorkers.add(workerFactory.getNewWorker("Stone"));
        newWorkers.add(workerFactory.getNewWorker("Stone"));
        newWorkers.add(workerFactory.getNewWorker("Stone"));
        newWorkers.add(workerFactory.getNewWorker("Roof"));
        newWorkers.add(workerFactory.getNewWorker("Roof"));
        newWorkers.add(workerFactory.getNewWorker("Roof"));
        newWorkers.add(workerFactory.getNewWorker("Roof"));

        for(Worker worker: newWorkers){
            worker.doWork();
            System.out.println(worker);
        }
    }
}
