package com.day5PracticeProblems.basicCore;

import java.util.*;

public class Array_2D {
    Scanner scanCommon = new Scanner(System.in);

    public void arrayInt() {
        System.out.println("Specify number of rows");
        int rowLength = scanCommon.nextInt();
        System.out.println("Specify number of columns");
        int columnLength = scanCommon.nextInt();
        int[][] array = new int[rowLength][columnLength];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the element of row: " + i + " and column: " + j);
                array[i][j] = scanCommon.nextInt();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(" "+array[k][l] + " ");
            }
        }
    }

    public void arrayDouble() {
        System.out.println("Enter the number of rows");
        int rowLength = scanCommon.nextInt();
        System.out.println("Enter the number of columns");
        int columnLength = scanCommon.nextInt();

        Double[][] array = new Double[rowLength][columnLength];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the  array elements of row " + i + " and column " + j);
                array[i][j] = scanCommon.nextDouble();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }

    public void arrayBoolean() {

        System.out.println("Enter the number of rows");
        int rowLength = scanCommon.nextInt();
        System.out.println("Enter the number of columns");
        int columnLength = scanCommon.nextInt();

        Boolean[][] array = new Boolean[rowLength][columnLength];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the  array elements of row " + i + " and column " + j);
                array[i][j] = scanCommon.nextBoolean();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array_2D methodSelect = new Array_2D();
        methodSelect.arrayType(methodSelect);
    }

    public void arrayType(Array_2D methodSelect) {
        Array_2D arrayObject = new Array_2D();
        System.out.println("""
                Please Input from following Options
                1. Integer
                2. Double
                3. Boolean
                4. Exit
                """);
        int arraySelect = scanCommon.nextInt();
        switch (arraySelect) {
            case 1 -> arrayObject.arrayInt();
            case 2 -> arrayObject.arrayDouble();
            case 3 -> arrayObject.arrayBoolean();
            case 4 -> System.out.println("\n\nThank you, visit again...!\n\n");
            default -> {
                System.out.println("\n\nInvalid  input, Please try again.\n\n");
                methodSelect.arrayType(methodSelect);
            }
        }


    }
}
