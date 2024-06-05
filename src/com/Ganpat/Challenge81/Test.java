package com.Ganpat.Challenge81;

public class Test {
    public static void main(String[] args) {
        Person men1 = new Person("Sita", 19);
        Person men2 = new Person("Sita", 19);

        if(men1.equals(men2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        System.out.println(men1.hashCode());
        System.out.println(men2.hashCode());
    }
}
