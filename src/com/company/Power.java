package com.company;

public class Power implements Calculable {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
