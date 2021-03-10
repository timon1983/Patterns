package main.java.com.timon1983.Patterns.AbstractFactory;

import main.java.com.timon1983.Patterns.AbstractFactory.Shop.ShopWorkTeam;

public class ShopAbstractFactory {
    public static void main(String[] args) {
        WorkTeam workTeam = new ShopWorkTeam();
        Mason mason = workTeam.getMason();
        Roofer roofer = workTeam.getRoofer();
        Electrician electrician = workTeam.getElectrician();
        Plumber plumber = workTeam.getPlumber();

        System.out.println("Приступить к строительству магазина.");

        mason.laysBrick();
        roofer.buildingRoof();
        electrician.electricalInstalation();
        plumber.laysPipe();
    }
}
