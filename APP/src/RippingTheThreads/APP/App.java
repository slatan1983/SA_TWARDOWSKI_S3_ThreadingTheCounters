package RippingTheThreads.APP;

import BLL.RippingTheThreads.MyThread;
import RippingTheThreads.Interfaces.Actable;
import UI.RippingTheThreads.UI;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Actable ui = new UI();
        int noOfThreads = ui.numberOfThreads();

        for(int i = 1; i <= noOfThreads; i++) {
            MyThread myThread = new MyThread(Integer.toString(i));
            Thread thread = new Thread(myThread);
            thread.start();
        }

    }

}
