package main.java.com.timon1983.Patterns.Visitor;

public class Builder implements Worker{

    @Override
    public void startWork(BuildHouse buildHouse) {
        System.out.println("Building houses very well");
    }

    @Override
    public void startWork(DriveCar driveCar) {
        System.out.println("Able to drive a car");
    }

    @Override
    public void startWork(TreatPeople treatPeople) {
        System.out.println("Not able to treat people");
    }
}
