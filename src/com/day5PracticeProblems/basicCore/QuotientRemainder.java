package com.day5PracticeProblems.basicCore;

import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args) {
        QuotientRemainder methodCall = new QuotientRemainder();
        methodCall.quotientAndRemainder();
    }

    public void quotientAndRemainder() {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the number to be divided.");
        int number = numberInput.nextInt();
        System.out.println("Enter divisor.");
        int divisor = numberInput.nextInt();
        System.out.println("The quotient for " + number + "/" + divisor + "=" + (number / divisor) + ", with remainder = " + (number % divisor));
    }
}
