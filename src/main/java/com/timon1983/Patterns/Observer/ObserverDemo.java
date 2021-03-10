package main.java.com.timon1983.Patterns.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addPrise(100);
        shop.addPrise(200);
        shop.addPrise(300);
        shop.addPrise(400);
        System.out.println("This is our current prices : " + shop.pricesList);
        System.out.println("==========================================");

        Audit audit1 = new Auditors("John");
        Audit audit2 = new Auditors("Erica");

        shop.addAuditor(audit1);
        shop.addAuditor(audit2);

        shop.upPrice(50);
        System.out.println("==========================================");
        shop.downPrice(100);

    }
}
