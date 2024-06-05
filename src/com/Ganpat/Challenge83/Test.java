package com.Ganpat.Challenge83;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Shape sh = new Shape();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Shape Number Which is listed below. ");
        System.out.println("1. Circle\n2. Square\n");
        int shapeNo = sc.nextInt();

        if(shapeNo == 1){
            System.out.println("Enter the radius in Cm : ");
            double ra= sc.nextDouble();
            Circle cr = new Circle(ra);
            cr.CirculateArea();

        }else{
            System.out.println("Enter the Base in Cm : ");
            double bas = sc.nextDouble();

            Square sq = new Square(bas);
            sq.CirculateArea();

        }






    }
}
