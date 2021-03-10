package main.java.com.timon1983.Patterns.AbstractFactory.Shop;

import main.java.com.timon1983.Patterns.AbstractFactory.Mason;

public class ShopMason implements Mason {
    @Override
    public void laysBrick() {
        System.out.println("Строит стены магазина.");
    }
}
