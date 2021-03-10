package main.java.com.timon1983.Patterns.AbstractFactory.Shop;

import main.java.com.timon1983.Patterns.AbstractFactory.Roofer;

public class ShopRoofer implements Roofer {
    @Override
    public void buildingRoof() {
        System.out.println("Строит крышу магазина.");
    }
}
