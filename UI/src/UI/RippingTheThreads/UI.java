package UI.RippingTheThreads;
import RippingTheThreads.Interfaces.Actable;
import RippingTheThreads.Interfaces.UserInput;

public class UI implements Actable {

    @Override
    public int numberOfThreads(){
        System.out.println("How many threads do you want to start? Choose 1-8");
        int numberThreads = 0;
        return numberThreads = UserInput.getUserInt();
    }

}
