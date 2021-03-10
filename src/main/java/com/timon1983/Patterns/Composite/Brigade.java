package main.java.com.timon1983.Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Brigade {
    List<Worker> brigate = new ArrayList<>();

    void addWorker(Worker worker){
        brigate.add(worker);
    }

    void brigateDoWork(){
        for(Worker worker : brigate){
            worker.doWork();
        }
    }
}
