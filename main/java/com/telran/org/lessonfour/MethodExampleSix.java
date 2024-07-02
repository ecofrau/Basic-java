package com.telran.org.lessonfour;

import java.util.Scanner;

public class MethodExampleSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a : ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        //method slogeniyy,poluchit resuly i vyvesti v konsol
        int result = getSum(a, b);
        System.out.println("Summa a + b = " + result);

    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;


    }

}







