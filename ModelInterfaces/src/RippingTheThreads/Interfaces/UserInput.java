package RippingTheThreads.Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface UserInput {

    public static int getUserInt(){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int userInt = 0;
        String userInput = "";

        while(userInput.equalsIgnoreCase("") || (userInt == 0) || (userInt > 8)) {
            try{
                userInput = buf.readLine();
                userInt = Integer.parseInt(userInput);
            }catch(NumberFormatException | IOException nfe){
                userInput = "";
                continue;
            }
        }
        return userInt;
    }
}
