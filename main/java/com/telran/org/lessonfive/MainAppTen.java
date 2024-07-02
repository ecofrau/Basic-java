package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainAppTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 0  to 9");
        int num = scanner.nextInt();
        String infoString = getInfoString(num);
        System.out.println(infoString);

        // тернарный оператор
        // результат = (условие) ? если условие истина : если условие ложь
        //

        String result = null;
        if (num > 5) {
            result = "Number greater than 5";
        } else {
            result = "Number smaller than 5";
        }

        //OR
        result = (num > 5) ? "Number greater than 5" : "Number smaller than 5";
    }

    public static String getInfoString(int num) {
        return num > 5 ? "Number greater than 5" : "Number smaller than 5";

//        if (num > 5) {
//            return "Number greater than 5";
//        } else {
//            return "Number smaller than 5";
//        }
    }
}
