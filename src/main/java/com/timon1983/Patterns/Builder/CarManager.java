package main.java.com.timon1983.Patterns.Builder;

public class CarManager {
    CarsBuilder carsBuilder;

    public void setCarsBuilder(CarsBuilder carsBuilder) {
        this.carsBuilder = carsBuilder;
    }

    public Car getNewCar(){
        carsBuilder.createCar();
        carsBuilder.buildType();
        carsBuilder.buildCustomer();
        carsBuilder.buildFuel();
        carsBuilder.buildPrice();

        Car car = carsBuilder.getCar();
        return car;
    }
}
