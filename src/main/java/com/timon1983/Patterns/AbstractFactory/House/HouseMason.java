package main.java.com.timon1983.Patterns.AbstractFactory.House;

import main.java.com.timon1983.Patterns.AbstractFactory.Mason;

public class HouseMason implements Mason {
    @Override
    public void laysBrick() {
        System.out.println("Строит стены дома.");
    }
}
