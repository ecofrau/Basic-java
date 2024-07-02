package com.telran.org.lessontwo;

public class TypePrinter {
    public static void  main(String[] args){
        //boolean - true/false

        boolean isLessonFinished = false;
        boolean isBoringLesson = true;
        System.out.println("Our lesson is finished ? " + isLessonFinished);
        System.out.println("Our lesson is boring ? " + isBoringLesson);

        //byte (-128 to 127)  (size 1byte(8bit))
//        byte byteExample = 100;

        byte number = 100;
        System.out.println("Byte is " + number);
      //        number = 500;  false

      //         short (-32768 to 32767) (size 2 byte(16bit))
//        short shortExample = 32000;
        int intExample = 333333333;
        System.out.println("Int example " + intExample);
        long longExample = 2222563335675656l;
     //       float ( to 7 digit)=32bit
        float floatExample = 123.5f;


        //double ( to 16 digit = 64 bit)
        double doubleExample = 123.5;



        //Reference(ссылка)
        //String (array chars) // default = null
        String stringExample = "Hello Java!";
        System.out.println(stringExample);
        System.out.println("Hello");
        System.out.println(5);
        System.out.println(stringExample + "Hello!");


}
}
