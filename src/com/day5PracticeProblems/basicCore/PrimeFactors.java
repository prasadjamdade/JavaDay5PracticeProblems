package com.day5PracticeProblems.basicCore;

import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors methodCall = new PrimeFactors();
        methodCall.factorsFinder();
    }

    public void factorsFinder() {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter number to find its prime factors");
        int number = numberInput.nextInt();
        int i = 2;
        while ((number > 0) & (i <= number)) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
            } else {
                i++;
            }
        }
    }
}
