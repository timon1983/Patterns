package main.java.com.timon1983.Patterns.Builder;

public class Car {
    private String type;
    private Customer customer;
    private Fuel fuel;
    private int price;

    public void setType(String type) {
        this.type = type;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", customer=" + customer +
                ", fuel=" + fuel +
                ", price=" + price +
                '}';
    }
}
