package com.day5PracticeProblems.basicCore;


public class ZeroSum3Int {
    public static void main(String[] args) {
        ZeroSum3Int methodCaller = new ZeroSum3Int();
        methodCaller.arraySum();
    }

    static void arraySum() {
        int[] array = {5, -3, -2, 6, 8};
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Sum of the array elements resulting to 0 are ");
                        System.out.print(array[i] + " ");
                        System.out.print(array[j] + " ");
                        System.out.print(array[k] + " ");
                    }
                }
            }
        }

    }
}
