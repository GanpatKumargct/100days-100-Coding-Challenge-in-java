package com.Ganpat.Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India","New Delhi");
        countryMap.put("China", "Bizing");
        countryMap.put("Nepal", "Bhutan");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Country Name : ");
        String country = sc.next();

        if (countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s \n",country,countryMap.get(country));
        }else {
            System.out.println("Sorry..... this country is didn't in my DataBase.");
        }

    }

}
