package main.java.com.timon1983.Patterns.Observer;

public interface FollowThePrice {

    void addAuditor(Audit audit);

    void notification(boolean balance , int changePrice);
}
