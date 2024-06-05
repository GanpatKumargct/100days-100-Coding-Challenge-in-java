package com.Ganpat.Challenge77.utils;


import com.Ganpat.Challenge77.Geometry.Reactangle;
import com.Ganpat.Challenge77.Geometry.Circle;

public class Calculator {
    public static void main(String[] args) {

        Circle cir = new Circle(5.5);
        Reactangle react = new Reactangle(5,8);

        double cirArea = Math.PI*Math.pow(cir.radius,2);
        double reacArea = react.breathe*react.length;

        System.out.println("Area of circle is : "+cirArea);
        System.out.println("Area of Reactangle is : "+reacArea);
    }
}
