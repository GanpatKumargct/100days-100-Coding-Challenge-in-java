package com.Ganpat.Challenge90;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Custom_Comprator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Lion", "Ant", "Zebra", "Bull");
        System.out.println("Original Order : "+list);
        System.out.print("Sorting in Descending Order : ");
        sortInDescending(list);
        System.out.println(list);

    }


    public static void sortInDescending(List<String> strList){
        //Normal Sort
//        Collections.sort(strList);


        //Comparator by Custom
        Collections.sort(strList, new Comparator<String>() {


            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0)< o2.charAt(0)) {
                    return 1;
                }else {
                    return -1;
                }

            }
        });
    }
}
