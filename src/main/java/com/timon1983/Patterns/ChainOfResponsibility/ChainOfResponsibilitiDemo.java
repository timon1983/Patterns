package main.java.com.timon1983.Patterns.ChainOfResponsibility;

public class ChainOfResponsibilitiDemo {
    public static void main(String[] args) {
        PostOffice devNote = new DeliveryNotification();
        PostOffice devPack = new DeliveryPackages();
        PostOffice devServ = new DeliveryService();

        devNote.setPostOffice(devPack);
        devPack.setPostOffice(devServ);

        devNote.mailOperation();
    }
}
