package com.day5PracticeProblems.basicCore;

import java.util.*;

public class CoinFlipRatioToPercentage {
    public static void main(String[] args) {
        coinGame();
    }

    public static void coinGame() {
        int headCounter=0;
        int tailCounter=0;
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Please enter the time coin needs to be flipped.: ");
        int userInput = scanInput.nextInt();
        for (int i = 0; i < userInput; i++) {
            int coinFlipper = (int) (2 * Math.random() + 1);
            if (coinFlipper == 1) {
                headCounter++;
            }
            else
                tailCounter++;
        }
        System.out.println("--Head-- = "+ headCounter + " times");
        System.out.println("--Tail--= "+ tailCounter + " times\"");
        int headPercentage = (headCounter*100)/userInput;
        System.out.println("Occurrence % of Head is "+headPercentage+"%.");
        System.out.println("Occurrence % of Tail is "+(100-headPercentage)+"%.");
    }
}
