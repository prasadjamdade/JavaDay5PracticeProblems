package com.day5PracticeProblems.basicCore;

import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Distance methodCall = new Distance();
        methodCall.inputPoint(methodCall);
    }

    public static void displayDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance of point (x,y) to the origin (0,0) is = " + distance);

    }

    public void inputPoint(Distance methodCall) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter the value of x to calculate Euclidean distance");
        int point1 = scanInput.nextInt();
        System.out.println("Enter the value of y to calculate Euclidean distance");
        int point2 = scanInput.nextInt();
        displayDistance(point1, point2);

    }
}

