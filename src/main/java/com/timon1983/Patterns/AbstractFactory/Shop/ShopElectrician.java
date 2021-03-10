package main.java.com.timon1983.Patterns.AbstractFactory.Shop;

import main.java.com.timon1983.Patterns.AbstractFactory.Electrician;

public class ShopElectrician implements Electrician {
    @Override
    public void electricalInstalation() {
        System.out.println("Производит монтажэлектропроводки в магазине.");
    }
}
