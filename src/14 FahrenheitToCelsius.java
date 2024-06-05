import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Welcome To Fahrenheit To Celsius Calculator.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit Value : ");
        double F = sc.nextDouble();

        double C = ((F-32)*5/9);
        System.out.println("Celsius Value : "+C);
    }
}
