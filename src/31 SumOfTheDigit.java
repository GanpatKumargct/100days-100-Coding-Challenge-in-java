import java.util.Scanner;

class SumOfTheDigit {
    public void digit_integer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = input.nextInt();
        int sum = 0;

        while (N != 0) {
            sum = sum + (N % 10);
            N = N / 10;
            break;
        }



       /* for(int i = 1; 0<N; i=i/10){
            Sum = Sum + (N%10);
        }*/
        System.out.println("The of "+N+" digit integer is : "+sum);
    }

    public static void main(String[] args) {
        SumOfTheDigit sm = new SumOfTheDigit();
        sm.digit_integer();
    }
}
