class maxValuesAraayForEach63 {
    public static void main(String[] args) {
        int Array[] = {12,45,78,98,105, 42};


        for(int num: Array){
            System.out.print(num+" ");
        }

        int maxValue = maxValue(Array);
        System.out.println("The maximum value in Array is : "+maxValue);





    }

    public static int maxValue(int Array[]){

        {
            System.out.println("Welcome to finding the amx value in Array.......!");
        }
        int max = Integer.MIN_VALUE;

        for(int num : Array ){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
}
