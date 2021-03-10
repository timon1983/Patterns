package main.java.com.timon1983.Patterns.FactoryMethod;

public class Mason implements Worker{
    @Override
    public void doWork() {
        System.out.println("Производить укладку кирпича");
    }
}
