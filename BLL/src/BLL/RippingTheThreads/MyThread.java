package BLL.RippingTheThreads;

import RippingTheThreads.Interfaces.Countable;
import RippingTheThreads.Interfaces.Printable;
import RippingTheThreads.Interfaces.Timeable;

public class MyThread implements Runnable{

    String name;
    Countable counter;

    public MyThread(String newName, Countable counter){
        this.counter = counter;
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void run() {
        Timeable timer = new MyTimer();
        for(int i = 0; i < 100; i++){
            Printable.printCount(this.getName(), counter.count());
        }
        Printable.printTime(this.getName(), timer.getElapsedTime());

    }
}
