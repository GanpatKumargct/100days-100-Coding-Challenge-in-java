package com.Ganpat.Challenge89;

public class Vargas {


    public static void main(String[] args) {
        String nsm = "hjg";
        System.out.println(Concatenate("Ganpat"));
        System.out.println(Concatenate("Kumar","Yadav", "CSE"));
        System.out.println(Concatenate("Ganpat", "BE CSE", "CS048"));
    }

    public static String Concatenate(String... Strs){
        StringBuilder sb =  new StringBuilder();
        for (String str : Strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
