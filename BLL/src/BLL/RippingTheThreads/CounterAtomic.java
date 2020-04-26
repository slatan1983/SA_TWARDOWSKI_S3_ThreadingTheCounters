package BLL.RippingTheThreads;

import RippingTheThreads.Interfaces.Countable;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic implements Countable {

    AtomicInteger count = new AtomicInteger(0);

    public int count() {
        return count.incrementAndGet();
    }

}
