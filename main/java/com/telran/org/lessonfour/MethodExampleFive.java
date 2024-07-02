package com.telran.org.lessonfour;

import java.util.Scanner;

public class MethodExampleFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.next(); // ввели Алекс

        System.out.println("Input your age");
        int age = scanner.nextInt();
    printGreetings(name, age);
        System.out.println("Input our height; "); //170
        int height = scanner.nextInt();
        printBioInfo(age, height);
        printBioInfo(height, age);

    }

    public static void printGreetings(String name, int age) {
        System.out.println("Hello " + name + " your age is " + age);
    }

    public static void printBioInfo(int height, int age) {
        System.out.println("Your height " + height + "age is " + age);

    }
}
