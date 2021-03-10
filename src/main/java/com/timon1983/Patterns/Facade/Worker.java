package main.java.com.timon1983.Patterns.Facade;

public class Worker {

    void doWork(Customer customer) {
        if (customer.a == 0) {
            System.out.println("is working...");
        } else if (customer.a == 1) {
            System.out.println("is resting...");
        }
    }
}
