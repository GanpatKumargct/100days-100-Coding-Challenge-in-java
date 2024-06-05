import java.util.Scanner;

class SumAllOddNumber {
    public void sum_odd(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = input.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i = i+2){
            System.out.println("Your odd number is : "+i);
            sum+= i;
        }
        System.out.println("Sum of odd numbers from 1 to " + N + " : " + sum);

    }

    public static void main(String[] args) {
        SumAllOddNumber sm = new SumAllOddNumber();
        sm.sum_odd();
    }
}
