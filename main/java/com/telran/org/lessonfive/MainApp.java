package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        //boolean - true or false
        boolean result = num > 10;
        if (result) {
            //esli result=true vipolnyaetsya kod
            System.out.println("Inside IF , " + num + " > 10");
        } else {
            //esli result=false vipolnyaetsya kod
            System.out.println("Inside ELSE , " + num + " < 10");
        }
        System.out.println("End of program");
    }
}
