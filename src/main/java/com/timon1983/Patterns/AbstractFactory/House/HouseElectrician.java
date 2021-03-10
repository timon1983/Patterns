package main.java.com.timon1983.Patterns.AbstractFactory.House;

import main.java.com.timon1983.Patterns.AbstractFactory.Electrician;

public class HouseElectrician implements Electrician {
    @Override
    public void electricalInstalation() {
        System.out.println("Производит электромонтаж в доме. ");
    }
}
