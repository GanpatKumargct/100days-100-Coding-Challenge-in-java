package com.Ganpat.Challenge82;

public class Test {
    public static void main(String[] args) {

//        int num[] = {2,5, 8, 9, 10};


        ArrayOperation ao = new ArrayOperation(new int[] {4,5, 6, 9,10,12});
        ArrayOperation.Statisstics aa = ao.new Statisstics();

        System.out.println("Mean "+aa.mean());

    }
}
