package main.java.com.timon1983.Patterns.Facade;

public class FacadeWork {
    Customer customer = new Customer();
    Worker worker = new Worker();

    void doToFacade(){
        worker.doWork(customer);
    }
}
