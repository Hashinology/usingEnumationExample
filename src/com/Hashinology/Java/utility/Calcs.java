package com.Hashinology.Java.utility;

public class Calcs {

    /*
    public static final int ADD = 1001;
    public static final int SUBTRACT = 1002;
    */


    private int total;

    public Calcs(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public int currentValue(String prompt, Operation operation) throws NumberFormatException{
        String input = UserInput.getData(prompt);
        int usrInput = Integer.parseInt(input);

        switch (operation) {
            case ADD:
                total += usrInput;
                break;
            case SUBTRACT:
                total -= usrInput;
                break;
        }

        return usrInput;
    }
}
