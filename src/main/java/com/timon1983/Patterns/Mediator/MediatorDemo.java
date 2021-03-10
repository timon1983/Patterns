package main.java.com.timon1983.Patterns.Mediator;

public class MediatorDemo {
    public static void main(String[] args) throws InterruptedException {
        ConnectionOrder connectionOrder = new ConnectionOrder();
        Employee director = new Director(connectionOrder, "director");
        Employee employee1 = new EmployeeCommand(connectionOrder, "employee1");
        Employee employee2 = new EmployeeCommand(connectionOrder, "employee2");
        Employee employee3 = new EmployeeCommand(connectionOrder, "employee3");

        connectionOrder.setDirector(director);
        connectionOrder.addEmployee(employee1);
        connectionOrder.addEmployee(employee2);
        connectionOrder.addEmployee(employee3);

        employee1.sendCommand("I start work");
        Thread.sleep(1000);
        employee2.sendCommand("I start work too...");
        Thread.sleep(1000);
        employee3.sendCommand("I won't work here...");
        Thread.sleep(1000);
        director.sendCommand("I'm watching you...");

        System.out.println("======================================");
        System.out.println("Comьands recived by the diretor.\n");

        for (String s : Director.recivedCommandsForDirector){
            System.out.println(s);
        }
        System.out.println("======================================");
        System.out.println("Commands recived by employees.\n");
        for (String s: EmployeeCommand.recivedCommandsForEmployee){
            System.out.println(s);
        }
    }
}
