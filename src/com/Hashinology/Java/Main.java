package com.Hashinology.Java;

import com.Hashinology.Java.utility.Calcs;
import com.Hashinology.Java.utility.Operation;

public class Main {

    public static void main(String[] args) {
        Calcs c = new Calcs(100);
        try {
            while (true) {
                int input = c.currentValue("Enter the Value: ", Operation.ADD);
                int Total = c.getTotal();

                String msg = String.format("the Value is: %d and Total now is: %d",
                        input, Total);

                System.out.println(msg);
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong Entry");
            e.getMessage();
        }
    }
}
