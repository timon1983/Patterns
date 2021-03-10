package main.java.com.timon1983.Patterns.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Brigade team = new Brigade();

        Worker mason = new Mason();
        Worker roofer = new Roofer();
        Worker electrician = new Electrician();
        Worker plumber = new Plumber();

        team.addWorker(mason);
        team.addWorker(roofer);
        team.addWorker(electrician);
        team.addWorker(plumber);

        team.brigateDoWork();
    }
}
