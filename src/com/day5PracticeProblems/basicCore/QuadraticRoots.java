package com.day5PracticeProblems.basicCore;

import java.util.*;

public class QuadraticRoots {
    Scanner scanInput = new Scanner(System.in);

    public static void main(String[] args) {
        QuadraticRoots methodCall = new QuadraticRoots();
        methodCall.quadraticEquationRoots(methodCall);
    }

    public void quadraticEquationRoots(QuadraticRoots methodCall) {
        System.out.println("Enter the value of a");
        double a = scanInput.nextDouble();

        System.out.println("Enter the value of b");
        double b = scanInput.nextDouble();

        System.out.println("Enter the value of c");
        double c = scanInput.nextDouble();

        double delta = ((b * b) - (4 * a * c));
        double squareRootDelta = Math.sqrt(delta);
        if (squareRootDelta > 0) {
            double root1 = (-b + squareRootDelta) / (2 * a);
            double root2 = (-b - squareRootDelta) / (2 * a);
            System.out.println("Root 1 of equation(a*x*x + b*x + c) is x =" + root1);
            System.out.println("Root 2 of equation(a*x*x + b*x + c) is x =" + root2);
        } else {
            System.out.println("Delta value is in negative cannot compute, please enter valid inputs");
            methodCall.quadraticEquationRoots(methodCall);
        }
    }
}
