package main.java.com.timon1983.Patterns.Builder;

public class CarRunner {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        carManager.setCarsBuilder(new CarForGazprom());

        Car car = carManager.getNewCar();

        System.out.println(car);
    }
}
