package com.Ganpat.Challenge93;

import com.Ganpat.Challenge92.ListSwap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(45,78, 45, 2,85, 90);
        System.out.println(numList);

        //This is by Using Library
       /* Collections.sort(num);
        System.out.println("Sorted List "+num);
        Collections.reverse(num);
       System.out.println("Reverse List "+num );*/

        reverse(numList);
        System.out.println(numList);

    }

    public static void reverse(List<Integer> list){

        for (int i = 0; i < list.size()/2; i++) {
            ListSwap.Swap(list,i,list.size()-1-i);

        }
    }

}
