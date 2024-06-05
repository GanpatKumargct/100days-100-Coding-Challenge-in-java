import java.util.Scanner;

class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("Welcome to SimpleInterest Calculator.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle amount  : ");
        double P = sc.nextDouble();

        System.out.print("Enter Time in Year : ");
        int T = sc.nextInt();

        System.out.print("Enter The Rate : ");
        float R = sc.nextFloat();

        double SimpleIntreset = (P*T*R)/100;

        System.out.println("Simple Interest : "+SimpleIntreset);
        System.out.println("Total Amount : "+(P+SimpleIntreset));

    }
}
