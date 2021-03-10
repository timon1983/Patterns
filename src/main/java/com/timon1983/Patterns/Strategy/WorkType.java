package main.java.com.timon1983.Patterns.Strategy;

public class WorkType {

    private Working working;

    void setWorking(Working working){
        this.working = working;
    }

    void doWorking(){
        working.doWork();
    }
}
