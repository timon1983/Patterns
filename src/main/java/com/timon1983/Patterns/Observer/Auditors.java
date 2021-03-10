package main.java.com.timon1983.Patterns.Observer;

import java.util.List;

public class Auditors implements Audit {
    String name;

    public Auditors(String name) {
        this.name = name;
    }

    @Override
    public void actionAuditors(List<Integer> prices, boolean balance , int changePrice) {
        if (balance) {
            System.out.println("Attention mr." + name + " prices in our store have increased by " +
        changePrice + "$ : " + prices);
        }else {
            System.out.println("Attention mr." + name + " prices in our store have dicreased by " +
                    changePrice + "$ : " + prices);
        }
    }
}
