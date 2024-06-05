import java.util.Scanner;

class ProductoOfTwoFloating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Adding Floating Number");

        System.out.print("Enter a First number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter a Second Number : ");
        float num2 = sc.nextFloat();

        float add = num1+num2;

        System.out.println("Adding : "+add);
    }
}
