package com.kodilla;

public class Calculator {

    double a = 0.0;
    double b = 0.0;

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double addNumbers(){
        return  a + b;

    }

    public double subNumbers(){
        return  a - b;

    }
}
