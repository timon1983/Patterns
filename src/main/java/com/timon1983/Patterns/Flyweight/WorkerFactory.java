package main.java.com.timon1983.Patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {

    private Map<String, Worker> workers = new HashMap<>();

    public Worker getNewWorker(String buildMaterial){
        Worker worker = workers.get(buildMaterial);

        if(worker == null){
            switch (buildMaterial){
                case "Stone":
                    System.out.println("I need a new mason...");
                    worker = new Mason();
                    break;
                case "Roof":
                    System.out.println("I need a new roofer...");
                    worker = new Roofer();
                    break;
            }
            workers.put(buildMaterial, worker);
        }
        return worker;
    }
}
