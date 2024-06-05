package com.Ganpat.Challenge87;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int add = num1+num2;
            System.out.println("Add "+add);

            int divide = num1/num2;
            System.out.println("Divide : "+divide);
        }catch (java.lang.ArithmeticException e ){
            System.out.println("Exception is there : "+e.getMessage());
           /* if(e.getMessage().equals("/ by zero ")){
                System.out.println("Zero division is occurred");
            }else{
                throw e;
            }*/
        }finally {
            System.out.println("The code is successfully");
        }
    }
}
