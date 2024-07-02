package com.telran.org.lessonfour;

public class MethodExampleThree {
    public static void main(String[] args) {
        int count = getCountOfPages();
        System.out.println("Count of pages = " + count);


        System.out.println("Count of pages = " + getCountOfPages());
    }
    //метод возвращения целого числа
    //return - оператор возврата из метода
    public static int getCountOfPages(){
       int CountOfPages = 10;
        return CountOfPages;

       // return 10;
    }




}
