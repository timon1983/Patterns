package main.java.com.timon1983.Patterns.AbstractFactory.House;

import main.java.com.timon1983.Patterns.AbstractFactory.Plumber;

public class HousePlumber implements Plumber {
    @Override
    public void laysPipe() {
        System.out.println("Производит монтаж трубопровода и сантехники в доме.");
    }
}
