package com.telran.org.lessonthree;

public class StringExample {

    public static void main(String[] args) {
        String text = "Hello Java";
        System.out.println(text);
        System.out.println("Hello Java");

        //length - получение длины строки
        int lengthOne = text.length();
        int lengthTwo = "Hello Java".length();
        System.out.println("Length of text " + lengthOne);

        //charAt(index) - получение элемента по индексу из строки
        //если длина строки 5, то нумерация символов идет с 0 до 4
        //first 0 - last (length - 1)
        char temp = text.charAt(0);
        System.out.println("Letter from 0 position is " + temp);
        //temp = text.charAt(10); incorrect index

        String textOne = "Java!";
        System.out.println(textOne);
        String textTwo = textOne + "Hello!";
        System.out.println(textTwo);
    }
}
