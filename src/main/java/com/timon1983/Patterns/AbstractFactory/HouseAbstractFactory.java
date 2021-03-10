package main.java.com.timon1983.Patterns.AbstractFactory;

import main.java.com.timon1983.Patterns.AbstractFactory.House.HouseWorkTeam;
import main.java.com.timon1983.Patterns.AbstractFactory.Shop.ShopWorkTeam;

public class HouseAbstractFactory {
    public static void main(String[] args) {
        WorkTeam workTeam = new HouseWorkTeam();
        Mason mason = workTeam.getMason();
        Roofer roofer = workTeam.getRoofer();
        Electrician electrician = workTeam.getElectrician();
        Plumber plumber = workTeam.getPlumber();

        System.out.println("Приступить к строительству дома.");

        mason.laysBrick();
        roofer.buildingRoof();
        electrician.electricalInstalation();
        plumber.laysPipe();

    }
}
