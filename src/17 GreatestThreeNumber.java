import java.util.Scanner;

class GreatestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Greatest of three number.");

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the Third number : ");
        int num3 = sc.nextInt();

        if(num1 > num3 && num1 >num2){
            System.out.println(num1+" is a Greatest Number");
        } else if (num2>num3 && num2>num1) {
            System.out.println(num2+" is a Greatest Number");
        } else if (num3>num2 && num3>num1) {
            System.out.println(num3+" is a Greatest Number");
        }
    }
}
