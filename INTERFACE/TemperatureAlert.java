package Interfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 40.0;
        double currentTemp = 42.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("High Temperature Alert!");
        } else {
            System.out.println("Temperature Normal");
        }
    }
}

