package main.java.com.timon1983.Patterns.Builder;

public class CarForYandexDrive extends CarsBuilder{
    @Override
    void buildType() {
        car.setType("Passenger car");
    }

    @Override
    void buildCustomer() {
        car.setCustomer(Customer.YANDEXDRIVE);
    }

    @Override
    void buildFuel() {
        car.setFuel(Fuel.GAZ);
    }

    @Override
    void buildPrice() {
        car.setPrice(30000);
    }
}
