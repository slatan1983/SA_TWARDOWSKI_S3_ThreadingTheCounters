package BLL.RippingTheThreads;

import RippingTheThreads.Interfaces.Timeable;

public class MyTimer implements Timeable {
    final long startTime;
    long endTime;
    long elapsedTime;

    public MyTimer(){
        this.startTime = java.lang.System.currentTimeMillis();
    }

    public long getElapsedTime(){
        this.endTime = java.lang.System.currentTimeMillis();
        this.elapsedTime = this.endTime - this.startTime;
        return this.elapsedTime;
    }
}
