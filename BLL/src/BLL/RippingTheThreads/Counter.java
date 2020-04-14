package BLL.RippingTheThreads;

import RippingTheThreads.Interfaces.Countable;

public class Counter implements Countable {
    int count = 0;

    public synchronized int count() {
        return this.count++;
    }

    public int getCount(){
        return this.count;
    }
}
