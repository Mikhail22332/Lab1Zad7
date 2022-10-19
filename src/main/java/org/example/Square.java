package org.example;

public class Square extends Shape{
    @Override
    public double  pole(double a, double b) {
        return a*b;
    }

    @Override
    public double obwod(double a, double b) {
        return 2*a + 2*b;
    }
}
