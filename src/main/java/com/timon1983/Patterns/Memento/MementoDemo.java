package main.java.com.timon1983.Patterns.Memento;

public class MementoDemo {
    public static void main(String[] args) {
        WorkPlan workPlan = new WorkPlan();
        ArhiveBase arhiveBase1 = new ArhiveBase();
        ArhiveBase arhiveBase2 = new ArhiveBase();
        ArhiveBase arhiveBase3 = new ArhiveBase();

        workPlan.setPlanName("Plan1");
        arhiveBase1.setArhive(workPlan.arhive());
        System.out.println(workPlan);


        workPlan.setPlanName("Plan2");
        arhiveBase2.setArhive(workPlan.arhive());
        System.out.println(workPlan);


        workPlan.setPlanName("Plan3");
        arhiveBase3.setArhive(workPlan.arhive());
        System.out.println(workPlan);


        System.out.println("Return to befor work plans:");

        workPlan.loadPlan(arhiveBase2.getArhive());
        System.out.println(workPlan);

        workPlan.loadPlan(arhiveBase1.getArhive());
        System.out.println(workPlan);

    }
}
