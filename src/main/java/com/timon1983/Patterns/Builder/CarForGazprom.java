package main.java.com.timon1983.Patterns.Builder;

public class CarForGazprom extends CarsBuilder{
    @Override
    void buildType() {
        car.setType("Cargo");
    }

    @Override
    void buildCustomer() {
        car.setCustomer(Customer.GAZPROM);
    }

    @Override
    void buildFuel() {
        car.setFuel(Fuel.DIZEL);
    }

    @Override
    void buildPrice() {
        car.setPrice(50000);
    }
}
