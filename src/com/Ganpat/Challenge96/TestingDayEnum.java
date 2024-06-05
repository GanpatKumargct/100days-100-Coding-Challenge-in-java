package com.Ganpat.Challenge96;

public class TestingDayEnum {
    public static void main(String[] args) {
        Day d = Day.Monday;
        System.out.println(d);

        System.out.println("Printing Days of the Week");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }


}
