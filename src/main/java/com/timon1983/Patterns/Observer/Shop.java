package main.java.com.timon1983.Patterns.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Shop implements FollowThePrice {

    List<Integer> pricesList = new ArrayList<>();

    List<Audit> auditList = new ArrayList<>();



    public void addPrise(Integer price) {
        this.pricesList.add(price);
    }

    public void upPrice(int increasePrice) {
        ListIterator<Integer> iterator = this.pricesList.listIterator();
        while(iterator.hasNext()){
            int newPrice = iterator.next() + increasePrice;
            iterator.set(newPrice);
        }
        notification(true , increasePrice);
    }

    public void downPrice(int dicreasePrice) {
        ListIterator<Integer> iterator = this.pricesList.listIterator();
        while(iterator.hasNext()){
            int newPrice = iterator.next() - dicreasePrice;
            iterator.set(newPrice);
        }
        notification(false, dicreasePrice );
    }

    @Override
    public void addAuditor(Audit audit) {
        this.auditList.add(audit);
    }

    @Override
    public void notification(boolean balance , int changePrice) {
        for (Audit audit : auditList) {
            audit.actionAuditors(this.pricesList, balance , changePrice);
            }
        }
    }

