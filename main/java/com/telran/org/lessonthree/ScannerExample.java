package com.telran.org.lessonthree;

import java.util.Scanner;



public class ScannerExample {

    public static void main(String[] args) {
        //scanner - объект для получения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your age :");
        //ввод числа с клавиатуры и присвоение этого числа в переменную age
        //nextInt() - это запрос на ввод целого числа с клавиатуры
        int age = scanner.nextInt();

        System.out.println("Your age is " + age);


        System.out.println("Please input your name :");
        String name = scanner.next();
        System.out.println("your name is " + name);


        System.out.println("please input your surname :");
        String surname = scanner.next();
        System.out.println("your surname is " + surname);

        System.out.println("\nyour bio is :");
        System.out.println("your name : " + name + ", surname : " + surname+ ", age" + age);
        System.out.println("And input your name and surname as one string  : ");
        String fio = scanner.nextLine();
        System.out.println("Your fio is " + fio);

    }
}