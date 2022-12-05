package com.day1problem.homework;

import java.util.Scanner;

public class SumCommandLineArgumentP4 {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter argument 1: ");
        int a = getInput.nextInt();
        System.out.println("Enter argument 2: ");
        int b = getInput.nextInt();
        int sum = a + b ;
        System.out.println("Sum of arguments is : " + sum);
        getInput.close();
    }
}
