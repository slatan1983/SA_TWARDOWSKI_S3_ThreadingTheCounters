package BLL.RippingTheThreads;

import RippingTheThreads.Interfaces.Countable;

public class Counter implements Countable {
    private int count = 1;

    public int count(){
        return count++;
    }
}
