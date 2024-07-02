package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainAppNine {

    public static void main(String[] args) {
        //  && - and, & - full operator and
        //|| - or, | - full operator Or
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 0 to 9");
        System.out.println("First number : ");
        int first = scanner.nextInt();
        System.out.println("Second number : ");
        int second = scanner.nextInt();

        System.out.println("\nCheck && Conditional");
        if ((first > 0) && (second > 0)) {
            System.out.println("Both more than zero");
        } else {
            System.out.println("One of them less than zero");
        }
        System.out.println("\nCheck && Conditional");
        if ((first > 0) || (second > 0)) {
            System.out.println("one of them more than zero");
        } else {
            System.out.println("both of them less than zero");
        }
        //from 0 to 9
        if (first >= 0 && first <= 9 ) {
            System.out.println("First from 0 to 9");
        }
    }
}
