package main.java.com.timon1983.Patterns.AbstractFactory.Shop;

import main.java.com.timon1983.Patterns.AbstractFactory.Plumber;

public class ShopPlumber implements Plumber {
    @Override
    public void laysPipe() {
        System.out.println("Производит монтаж трубопровода и сантехники в магазине.");
    }
}
