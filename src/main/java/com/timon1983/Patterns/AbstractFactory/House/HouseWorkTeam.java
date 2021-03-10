package main.java.com.timon1983.Patterns.AbstractFactory.House;

import main.java.com.timon1983.Patterns.AbstractFactory.*;

public class HouseWorkTeam implements WorkTeam {
    @Override
    public Mason getMason() { return new HouseMason(); }

    @Override
    public Roofer getRoofer() {
        return new HouseRoofer();
    }

    @Override
    public Electrician getElectrician() {
        return new HouseElectrician();
    }

    @Override
    public Plumber getPlumber() {
        return new HousePlumber();
    }
}
