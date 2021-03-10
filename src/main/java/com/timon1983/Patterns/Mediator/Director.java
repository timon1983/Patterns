package main.java.com.timon1983.Patterns.Mediator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Director implements Employee{
    Connection connection;
    String name;
    static List<String> recivedCommandsForDirector = new ArrayList<>();

    public Director(Connection connection, String name) {
        this.connection = connection;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendCommand(String command) {
        connection.sendCommand(command,this);
    }

    @Override
    public void getCommand(String command) {
        recivedCommandsForDirector.add(command + " /" + new Date() + "/");
        System.out.println("The director reciving command :" + command + ".../");

    }
}
