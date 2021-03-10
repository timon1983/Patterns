package main.java.com.timon1983.Patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConnectionOrder implements Connection{

    Employee director;
    List<Employee> employees = new ArrayList<>();

    public void setDirector(Employee director) {
        this.director = director;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    @Override
    public void sendCommand(String command, Employee employee) {
        for (Employee e : employees){
            if (e != employee){
                e.getCommand(command);
            }
        }
        director.getCommand(command);
    }
}
