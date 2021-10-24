package com.day5PracticeProblems.basicCore;

import java.util.*;

public class EvenOddCheck {
    public static void main(String[] args) {
        EvenOddCheck methodCall = new EvenOddCheck();
        methodCall.evenOddCheck();
    }

    public void evenOddCheck() {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the Number to check even or odd");
        int numCheck = numberInput.nextInt();
        if (numCheck % 2 == 0)
            System.out.println(numCheck + " is an even number");
        else
            System.out.println(numCheck + " is an odd number");
    }
}
