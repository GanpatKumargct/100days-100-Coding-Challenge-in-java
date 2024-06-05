package com.Ganpat.Challenge83;

public class Square extends Shape{

    private double base;

    public Square(double base) {
        this.base = base;
    }

    @Override
    public void CirculateArea() {
        double Area = Math.pow(base,2);
        System.out.println("Area of Square : "+Area);


    }
}
