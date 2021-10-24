package com.day5PracticeProblems.basicCore;

import java.util.*;

public class HarmonicNumberProgression {
    public static void main(String[] args) {
        HarmonicNumberProgression methodCall = new HarmonicNumberProgression();
        methodCall.harmonicPrint();
    }

    public void harmonicPrint() {
        Scanner harmonicScan = new Scanner(System.in);
        System.out.println("Enter the power of 2 you want to print 2^N for: ");
        int harmonicPowerLimit = harmonicScan.nextInt();
        if (harmonicPowerLimit > 0) {
            //setting up variables to add up the sum of harmonic progression
            double sumOfHarmonicProgression = 0;
            double harmonicProgressionLastValue = (double) 1 / harmonicPowerLimit; //to add up at the end.

            //for loop to print the values and sum the values
            for (int i = 1; i <= harmonicPowerLimit; i++) {
                if (i < harmonicPowerLimit) {
                    System.out.print("(1/" + i + ") + ");
                    sumOfHarmonicProgression += (double) 1 / i; //this expression will add up to second last value only
                } else
                    System.out.print("(1/" + i + ")");
            }
            System.out.println(" = " + (sumOfHarmonicProgression + harmonicProgressionLastValue));
        } else
            System.out.println("1/0 is infinity.");
    }
}
