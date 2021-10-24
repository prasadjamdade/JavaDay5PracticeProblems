package com.day5PracticeProblems.basicCore;

import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        SwapNumbers methodCall = new SwapNumbers();
        methodCall.swapNumbers();
    }

    public void swapNumbers() {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = numberInput.nextInt();
        System.out.println("Enter second number.");
        int secondNumber = numberInput.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("First number =" + firstNumber);
        System.out.println("Second number =" + secondNumber);
    }
}
