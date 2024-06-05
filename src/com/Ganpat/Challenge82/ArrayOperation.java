package com.Ganpat.Challenge82;

public class ArrayOperation {

    private int[] arr ;

    public ArrayOperation(int[] arr) {
        this.arr = arr;
    }

    public  class Statisstics{
        public double mean(){
            int sum = 0;
//            for(int i = 0; i < arr.length; i++){
//                System.out.println();
//                sum += i;
//            }

           for(int num : arr){
               sum += num;
           }

            return sum/ arr.length;
        }
        public void median(int arr[]){

        }



    }
}
