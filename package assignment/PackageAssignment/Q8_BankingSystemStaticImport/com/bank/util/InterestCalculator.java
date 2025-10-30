package com.bank.util;
public class InterestCalculator {
    public static double calculateSimpleInterest(double p,double r,double t){
        return (p*r*t)/100.0;
    }
    public static double calculateCompoundInterest(double p,double r,double t){
        return p * (Math.pow(1 + r/100.0, t)) - p;
    }
}
