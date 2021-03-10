package main.java.com.timon1983.Patterns.State;

public class WorkType {

    private Working working;

    void setWorking(Working working){
        this.working = working;
    }

    void newWorkingStage(){
        if (working instanceof BuildingHouse) {
            working.doWork();
            setWorking(new MakingPlumbing());

        }else if (working instanceof MakingPlumbing) {
            working.doWork();
            setWorking(new MakingElectricity());

        }else if (working instanceof MakingElectricity){
            working.doWork();
            System.out.println("The house is finished");

        }
    }
}
