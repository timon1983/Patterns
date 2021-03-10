package main.java.com.timon1983.Patterns.Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Skils skils = new Skils();
        Worker builder = new Builder();
        Worker driver = new Driver();
        Worker doctor = new Doctor();

        skils.doWork(builder);
        System.out.println("============================");
        skils.doWork(driver);
        System.out.println("============================");
        skils.doWork(doctor);

    }
}
