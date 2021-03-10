package main.java.com.timon1983.Patterns.Visitor;

public class Driver implements Worker{

    @Override
    public void startWork(BuildHouse buildHouse) {
        System.out.println("Not able to build houses");
    }

    @Override
    public void startWork(DriveCar driveCar) {
        System.out.println("Driving car very well");
    }

    @Override
    public void startWork(TreatPeople treatPeople) {
        System.out.println("Not able to treat people");
    }
}
