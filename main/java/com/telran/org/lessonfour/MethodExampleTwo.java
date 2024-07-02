package com.telran.org.lessonfour;

public class MethodExampleTwo {
    public static void methodTwo() {
        System.out.println("Two");
    }

    public static void main(String[] args) {
        methodOne();
        methodTwo();
        methodThree();
    }

    public static void methodOne() {
        System.out.println("One");
    }

    public static void methodThree () {
        System.out.println("Three");
    }
}
