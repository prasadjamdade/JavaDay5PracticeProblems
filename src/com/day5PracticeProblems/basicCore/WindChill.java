package com.day5PracticeProblems.basicCore;

import java.util.*;

public class WindChill {
    public static void main(String[] args) {
        WindChill methodCall = new WindChill();
        methodCall.windChillCalc();
    }

    public void windChillCalc() {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        double temperature_Fahrenheit = scanInput.nextDouble();
        System.out.println("Enter the wind speed in miles");
        double wind_Speed = scanInput.nextDouble();
        double effective_Temperature;
        if ((temperature_Fahrenheit < 50) & (wind_Speed < 120) & (wind_Speed > 3)) {
            effective_Temperature = 35.74 + (0.6215 * temperature_Fahrenheit) + (0.4275 * temperature_Fahrenheit - 35.75) * (Math.pow(wind_Speed, 0.16));
            System.out.println("Effective temperature is= " + effective_Temperature);
        } else
            System.out.println("Invalid data.");
    }
}
