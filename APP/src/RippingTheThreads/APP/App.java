package RippingTheThreads.APP;

import BLL.RippingTheThreads.Counter;
import BLL.RippingTheThreads.CounterAtomic;
import BLL.RippingTheThreads.MyThread;
import RippingTheThreads.Interfaces.Actable;
import RippingTheThreads.Interfaces.Countable;
import UI.RippingTheThreads.UI;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Actable ui = new UI();
        int noOfThreads = ui.numberOfThreads();

        //USE ONE OR THE OTHER TO RUN WITH OR WITHOUT RACE CONDITION

        //new Counter() causes race condition
        //Countable counter = new Counter();

        //new CounterAtomic() solves the problem with race condition
        Countable counter = new CounterAtomic();

        for(int i = 1; i <= noOfThreads; i++) {
            MyThread myThread = new MyThread(Integer.toString(i), counter);
            Thread thread = new Thread(myThread);
            thread.start();
        }

    }

}
