import java.util.Scanner;

class ArthmeticOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operator.");

        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter First Number : ");
        int num2 = sc.nextInt();

        System.out.println("Add : "+(num1+num2));
        System.out.println("Subtract : "+(num1-num2));
        System.out.println("Multiply : "+(num1*num2));
        System.out.println("Divide : "+(num1/num2));
        System.out.println("Modulus : "+(num1%num2));
    }
}
