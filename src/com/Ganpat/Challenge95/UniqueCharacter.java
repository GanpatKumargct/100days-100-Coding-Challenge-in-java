package com.Ganpat.Challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String userStr = sc.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your String has %d Unique Character.",unique.size());
    }
}
