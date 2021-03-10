package main.java.com.timon1983.Patterns.Memento;

public class WorkPlan {
    String planName;

    public void setPlanName(String planName) {
        this.planName = planName;

    }

    public Arhive arhive(){
        return new Arhive(planName);
    }

    public void loadPlan(Arhive arhive){
        planName = arhive.planName;
    }

    @Override
    public String toString() {
        return planName;
    }
}
