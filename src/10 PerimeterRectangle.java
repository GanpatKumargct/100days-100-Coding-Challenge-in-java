import java.util.Scanner;

class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To perimeter Calculator.");

        System.out.print("Enter a value of A : ");
        int A = sc.nextInt();

        System.out.print("Enter a value of A : ");
        int B = sc.nextInt();

        System.out.print("Enter a value of A : ");
        int C = sc.nextInt();

        System.out.print("Enter a value of A : ");
        int D = sc.nextInt();

        int perimeter = A+B+C+D;

        System.out.println("Perimeter Of Reactangle : "+perimeter);
    }
}
