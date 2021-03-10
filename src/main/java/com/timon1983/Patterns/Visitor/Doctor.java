package main.java.com.timon1983.Patterns.Visitor;

public class Doctor implements Worker{

    @Override
    public void startWork(BuildHouse buildHouse) {
        System.out.println("Not able to build houses");
    }

    @Override
    public void startWork(DriveCar driveCar) {
        System.out.println("Able to drive a car");
    }

    @Override
    public void startWork(TreatPeople treatPeople) {
        System.out.println("Treat people very well");
    }
}
