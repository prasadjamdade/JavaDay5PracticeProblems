package com.day5PracticeProblems.basicCore;

import java.util.*;

public class SeriesOfPowerOf2 {
    public static void main(String[] args) {
        SeriesOfPowerOf2 methodCall = new SeriesOfPowerOf2();
        methodCall.powerSeries();
    }
    public void powerSeries() {
        Scanner powerObject = new Scanner(System.in);
        System.out.println("Enter the power of 2 you want to print 2^N for: ");
        int powerPrintLimit = powerObject.nextInt();
        if ((powerPrintLimit <= 31) & (powerPrintLimit >= 0)) {
            for (int i = 0; i <= powerPrintLimit; i++) {
                int powerOutput = (int) Math.pow(2, i);
                if (i < powerPrintLimit) {
                    System.out.print(powerOutput + " , ");
                } else
                    System.out.print(powerOutput);
            }
        } else
            System.out.println("unable to print beyond 30th power.");
    }
}
