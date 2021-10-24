package com.day5PracticeProblems.basicCore;

import java.util.*;

public class LeapYearTester {
    public static void main(String[] args) {
        LeapYearTester methodCall = new LeapYearTester();
        methodCall.leapYearTest();
    }

    public void leapYearTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check whether leap year or not.");
        int year = sc.nextInt();
        if ((year >= 1000) & (year < 10000)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.println("\nEntered year is a Leap Year");
                    else
                        System.out.println("\nEntered year is Not a leap year");
                } else
                    System.out.println("\nEntered year is a Leap Year");
            } else
                System.out.println("\nEntered year is Not a leap year");
        } else
            System.out.println("Invalid Input");

    }
}