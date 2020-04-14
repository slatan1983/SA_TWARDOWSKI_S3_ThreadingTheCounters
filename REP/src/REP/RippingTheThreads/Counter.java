package REP.RippingTheThreads;

import RippingTheThreads.Interfaces.Countable;

public class Counter implements Countable {

    int count = 0;

    public int count() {
        return this.count++;
    }

    public int getCount(){return this.count;}

}
