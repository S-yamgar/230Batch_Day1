package com.day1problem.homework;

public class StaticBlockP6 {
    //static variable
            static int a = 10;
            static int b = 20;
     //static method
        static void printSum() {
            int c = a + b;
            System.out.println("addition  : " + c );
        }
    public static void main(String[] args) {
       StaticBlockP6.printSum();                //method call using class name
    }
}
