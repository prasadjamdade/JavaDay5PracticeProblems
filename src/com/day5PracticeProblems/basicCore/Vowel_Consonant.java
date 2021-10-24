package com.day5PracticeProblems.basicCore;

import java.util.*;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Vowel_Consonant methodCall = new Vowel_Consonant();
        methodCall.vowelConsonant();
    }

    public void vowelConsonant() {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the character");
        String character = numberInput.next().toUpperCase(Locale.ROOT);//.charAt(0)
        if ((character.equals("A")) || (character.equals("E")) || (character.equals("I")) || (character.equals("O")) || (character.equals("U")))
            System.out.println("Entered character is a vowel");
        else
            System.out.println("Entered character is consonant");
    }
}
