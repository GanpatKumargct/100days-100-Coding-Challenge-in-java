import java.util.Scanner;

class CompundIntrest {
    public static void main(String[] args) {
        System.out.println("Welcome to CompoundInterest Calculator.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle amount  : ");
        double P = sc.nextDouble();

        System.out.print("Enter Time in Year : ");
        int T = sc.nextInt();

        System.out.print("Enter The Rate : ");
        float R = sc.nextFloat();

        double Compound = (P*(1+R/100)*T);

        System.out.println("Compound Interest : "+Compound);
    }
}
