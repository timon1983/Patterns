package main.java.com.timon1983.Patterns.AbstractFactory;

public interface WorkTeam {
    Mason getMason();
    Roofer getRoofer();
    Electrician getElectrician();
    Plumber getPlumber();
}
