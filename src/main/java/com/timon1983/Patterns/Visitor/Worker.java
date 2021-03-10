package main.java.com.timon1983.Patterns.Visitor;

public interface Worker {
    void startWork(BuildHouse buildHouse);

    void startWork(DriveCar driveCar);

    void startWork(TreatPeople treatPeople);
}
