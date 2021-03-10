package main.java.com.timon1983.Patterns.ChainOfResponsibility;

public class DeliveryNotification extends PostOffice{
    @Override
    void printMassage() {
        System.out.println("You received notification about your package.");
    }
}
