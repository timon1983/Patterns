package main.java.com.timon1983.Patterns.Mediator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeCommand implements Employee{

    String name;
    Connection connection;
    static List<String> recivedCommandsForEmployee = new ArrayList<>();

    public EmployeeCommand(Connection connection, String name) {
        this.name = name;
        this.connection = connection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendCommand(String command) {
       connection.sendCommand(command, this);
    }

    @Override
    public void getCommand(String command) {
        recivedCommandsForEmployee.add(this.name + " : " + command + " /" + new Date() + "/");
        System.out.println("The " + this.name + " reciving command :" + command + ".../");
    }
}
