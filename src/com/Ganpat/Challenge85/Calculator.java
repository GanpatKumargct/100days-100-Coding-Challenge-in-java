package com.Ganpat.Challenge85;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }


    public static void main(String[] args) {
        Calculator ca = new Calculator();

       int r1 =  ca.add(5,8);
       int r2 = ca.add(85,45,65);
       double r3 = ca.add(50.2,45.8);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

}
