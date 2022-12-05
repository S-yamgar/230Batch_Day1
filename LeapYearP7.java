package com.day1problem.homework;

import java.util.Scanner;

public class LeapYearP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        //1582 given in problem
        // use if-elseif condition statement bec more than 2 condition
        if(year>=1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else if (year % 100 != 0 && year % 4 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println("Enter a valid input year");
        }

    }
}