package main.java.com.timon1983.Patterns.Proxy;

public class NewWorkPlan implements WorkPlan {
    String planName;

    public NewWorkPlan(String planName) {
        this.planName = planName;
        usePlan(planName);
    }

    public void usePlan(String planName){
        System.out.println("Use new plan of work " + planName);
    }

    @Override
    public void doWork() {
        System.out.println("Do the work according to the new plan " + planName + "... ");
    }
}
