package com.Ganpat.Challenge97;

public class TestingDayEnum {
    public static void main(String[] args) {


        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }


}
