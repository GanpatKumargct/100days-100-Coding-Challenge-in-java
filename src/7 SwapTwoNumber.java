import java.util.Scanner;

class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 45;

        System.out.print("Before Swap : "+a+","+b);

        int c = a;
        a = b;
        b = c;


        System.out.println();
        System.out.print("After Swap : "+a+","+b);


    }
}
