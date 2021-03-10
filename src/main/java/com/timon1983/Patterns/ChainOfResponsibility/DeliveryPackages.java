package main.java.com.timon1983.Patterns.ChainOfResponsibility;

public class DeliveryPackages extends PostOffice{
    @Override
    void printMassage() {
        System.out.println("Your package is delivered.");
    }
}
