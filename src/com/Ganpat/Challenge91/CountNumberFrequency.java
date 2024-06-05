package com.Ganpat.Challenge91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountNumberFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,7,8,4,5,2,5,3,55,25,5,45,5);
        System.out.println(Collections.frequency(list,5));
        System.out.println(Collections.frequency(list,8));
        System.out.println(Collections.frequency(list,20));
    }
}
