package main.java.com.timon1983.Patterns.Builder;

public abstract class CarsBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildType();

    abstract void buildCustomer();

    abstract void buildFuel();

    abstract void buildPrice();

    public Car getCar(){
        return car;
    }




}
