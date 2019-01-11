package com.kodilla;

public class Calculator {

    private static double a;
    private static double b;
/*    double a = 0.0;
    double b = 0.0;*/

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public static double addNumbers(double a, double b){
        return  a + b;

    }

    public static double subNumbers(double a, double b){
        return  a - b;

    }
}
