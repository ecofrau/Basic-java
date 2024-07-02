package com.telran.org.lessonfour;

import java.util.Scanner;

public class MethodExample {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    printGreetings(); // вызов метода
    String info = scanner.next();

    printGreetings(); // вызов метода
    info = scanner.next();

    printGreetings(); // вызов метода
    info = scanner.next();
}
//1 модификатор доступа
    //public - доступен везде из любого пакета
    //protected - доступен тут и в классах наследниках
    //private - доступен только тут
    //default - доступен тут и в своем пакете

    //2 static or not (optional) определяет принадлежность к классу или объекту

    //3 Тип возвращаемого значения: void - ничего не возвращает или тип данных(int, String etc)

    //4 Имя метода
    //5 Список параметров в круглых скобках: может быть, может не быть
    //6 Список исключений! (могут быть могут не быть)
    //7 Тело метода в {}

    public static void printGreetings() {
        System.out.println("Hello");
        System.out.println("Please input your info");
    }
}
