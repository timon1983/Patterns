package main.java.com.timon1983.Patterns.Proxy;

public class ProxyWorkPlan implements WorkPlan{
    String newPlan;
    NewWorkPlan newWorkPlan;

    public ProxyWorkPlan(String newPlan) {
        this.newPlan = newPlan;
    }

    @Override
    public void doWork(){
        if(newWorkPlan == null){
            newWorkPlan = new NewWorkPlan(newPlan);
        }
        newWorkPlan.doWork();
    }
}
