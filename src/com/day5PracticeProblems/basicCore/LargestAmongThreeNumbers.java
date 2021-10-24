package com.day5PracticeProblems.basicCore;

import java.util.*;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        LargestAmongThreeNumbers methodCall = new LargestAmongThreeNumbers();
        methodCall.largestInThree();
    }

    public void largestInThree() {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=numberInput.nextInt();
        System.out.println("Enter the second number");
        int num2=numberInput.nextInt();
        System.out.println("Enter the third number");
        int num3=numberInput.nextInt();
        if((num1>num2)&(num1>num3)){
            System.out.println(num1+" is largest among three");
        }
        else if ((num2>num1)&(num2>num3)) {
            System.out.println(num2 + " is largest among three");
        }
        else
            System.out.println(num3+" is largest among three");
    }
}
