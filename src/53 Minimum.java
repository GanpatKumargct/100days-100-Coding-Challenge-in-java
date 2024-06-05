import java.util.Scanner;

 class Minimum53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum number detector");

        System.out.print("Enter a number : ");
        int num1 = input.nextInt();

        System.out.print("Enter a Second Number : ");
        int num2 = input.nextInt();

        int mimimumNum = num1<num2? num1:num2;
        System.out.println(mimimumNum+" is a minimum number");
    }
}
