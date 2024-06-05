import java.util.Scanner;

class AddTwoNumber {
    public static void main(String[] args) {
        System.out.println("Welcome Adder Programme");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The first number : ");
        int num1 = sc.nextInt();


        System.out.print("Enter The first number : ");
        int num2 = sc.nextInt();

        int Add = num1+num2;

        System.out.print("Add : "+Add);
    }

}
