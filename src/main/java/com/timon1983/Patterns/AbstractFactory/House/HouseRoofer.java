package main.java.com.timon1983.Patterns.AbstractFactory.House;

import main.java.com.timon1983.Patterns.AbstractFactory.Roofer;

public class HouseRoofer implements Roofer {
    @Override
    public void buildingRoof() {
        System.out.println("Строит крышу дома.");
    }
}
