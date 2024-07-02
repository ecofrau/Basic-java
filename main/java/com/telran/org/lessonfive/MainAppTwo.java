package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainAppTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Hello!, 2-Bye!, 3-End program");
        int num = scanner.nextInt();
        //==
        //boolean result = num ==1;
        if (num == 1) {
            System.out.println("You input 1 -Hello!");
        } else {
            if (num == 2) {
                System.out.println("You input 2 -Bye!");
            } else {
                System.out.println("You input 3 - End program");
            }
        }
    }
}
