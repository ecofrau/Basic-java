package com.telran.org.lessontwo;


//UpperCamelCase - правило названия классов
// myApp // myapp _my // !!!! incorrect
// BookStorage // correct

//package - сущ, в нижнем регистре
//Class - сущ, UpperCamelCase - правило названия классов
//method - lowerCamelCase (printInfo, getName) // (method1, methods3,book !!! incorrect)
//variables - lowerCamelCase (age, name, rate, yearOfFoundation, bookAuthor)
public class MyApp {

    public static void main(String[] args) {
        //тип_данных_переменной имя_переменной = значение переменной
        //В переменной а, целого типа int, хранится значение 1995
        int yearOfJavaRealise = 1995;
        System.out.println(yearOfJavaRealise);
        printGreetings();
    }

    public static void printGreetings() {
        System.out.println("Hello");
    }
}


