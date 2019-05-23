package com.Hashinology.Java.utility;

import java.util.Scanner;

public class UserInput {
    static String getData(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
