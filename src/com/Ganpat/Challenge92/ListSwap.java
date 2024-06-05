package com.Ganpat.Challenge92;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ListSwap {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,5,87,45,12,51,80);

        System.out.println(numList);
        Swap(numList, 2,5);
        System.out.println(numList);
    }

    public static void Swap(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y,swap);
    }
}
