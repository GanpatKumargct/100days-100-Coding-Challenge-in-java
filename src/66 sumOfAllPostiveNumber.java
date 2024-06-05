class sumOfAllPostiveNumber {
    public static void main(String[] args) {
        int numArr[] = arrayInput.userinput();

        int sum = 0;

        for(int num : numArr ){
            if(num<0){
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive Numbers : "+sum);

    }
}
