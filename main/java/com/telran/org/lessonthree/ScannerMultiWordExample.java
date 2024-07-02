package com.telran.org.lessonthree;

import java.util.Scanner;

public class ScannerMultiWordExample {

    public static void main(String[] args) {
        //scanner - объект для получения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("And input your name and surname as one string : ");
        //nextLine() - запрашивает ввод нескольких слов
        String fio = scanner.nextLine();
        System.out.println("Your fio is " + fio);
    }
}