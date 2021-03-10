package main.java.com.timon1983.Patterns.Visitor;

public class Skils implements Work {

    Work[] workSkils;

    public Skils() {
        this.workSkils = new Work[]{new BuildHouse(), new DriveCar(), new TreatPeople()};
    }


    @Override
    public void doWork(Worker worker) {
        for(Work work : workSkils){
            work.doWork(worker);
        }
    }
}
