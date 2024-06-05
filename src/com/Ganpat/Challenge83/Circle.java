package com.Ganpat.Challenge83;

public class Circle extends Shape{

    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    @Override 
    public void CirculateArea() {
        double Area = Math.PI*Math.pow(rad,2);
        System.out.println("Area of circle is : "+Area);

    }
}
