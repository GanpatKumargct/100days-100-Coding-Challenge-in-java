class occurencesMaximumElementArray {
    public static void main(String[] args) {
        int Array[] = {12,45,78,78, 98,105,78, 42};
        int element = 78;

        for(int num: Array){
            System.out.print(num+" ");
        }
        System.out.println();
        int occ = occurencesMaxValue(Array,element);
        System.out.println("Your number was found in the array at "+occ+" times");
    }

    public static int occurencesMaxValue(int Array[], int element){
        int occurence = 0;
        for(int num : Array){
            if(num == element){
                occurence++;
            }
        }

        return occurence;
    }
}


