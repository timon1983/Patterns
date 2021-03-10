package main.java.com.timon1983.Patterns.AbstractFactory.Shop;

import main.java.com.timon1983.Patterns.AbstractFactory.*;


public class ShopWorkTeam implements WorkTeam {
    @Override
    public Mason getMason() {
        return new ShopMason();
    }

    @Override
    public Roofer getRoofer() {
        return new ShopRoofer();
    }

    @Override
    public Electrician getElectrician() {
        return new ShopElectrician();
    }

    @Override
    public Plumber getPlumber() {
        return new ShopPlumber();
    }
}
