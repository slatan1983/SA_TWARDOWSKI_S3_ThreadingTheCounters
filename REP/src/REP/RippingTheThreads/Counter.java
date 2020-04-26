package REP.RippingTheThreads;

import RippingTheThreads.Interfaces.Countable;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Countable {

    AtomicInteger count;

    public int count() {
        return this.count.incrementAndGet();
    }

}
