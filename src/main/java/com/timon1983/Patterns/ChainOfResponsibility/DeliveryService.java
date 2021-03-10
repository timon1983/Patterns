package main.java.com.timon1983.Patterns.ChainOfResponsibility;

public class DeliveryService extends PostOffice{
    @Override
    void printMassage() {
        System.out.println("The package was received.");
    }
}
