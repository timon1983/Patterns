package main.java.com.timon1983.Patterns.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Building building = new StoneHouse(new Mason());
        building.build();
    }
}
