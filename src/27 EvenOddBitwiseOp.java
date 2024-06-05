import java.util.Scanner;

class EvenOddBitwiseOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if((num&1) ==1){
            System.out.println("your number is odd");

        }else{
            System.out.println("Your number is even");
        }
    }
}
