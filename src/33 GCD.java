import java.util.Scanner;

class GCD {
    public void gcd(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N1 = input.nextInt();

        System.out.print("Enter the number : ");
        int N2 = input.nextInt();

        while (N2 != 0) {
            int temp = N2;
            N2 = N1 % N2;
            N1 = temp;

        }
        System.out.println("The GCd is : "+N1);

    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        gcd.gcd();
    }
}
