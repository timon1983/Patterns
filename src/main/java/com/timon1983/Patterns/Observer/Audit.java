package main.java.com.timon1983.Patterns.Observer;

import java.util.List;

public interface Audit {
    void actionAuditors(List<Integer> prices , boolean balance, int changePrice);
}
