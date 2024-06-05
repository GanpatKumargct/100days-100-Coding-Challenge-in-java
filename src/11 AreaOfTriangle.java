import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculate Area of Triangle");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base Value : ");
        int B = sc.nextInt();

        System.out.print("Enter Height Value : ");
        int H = sc.nextInt();

        double result = ((double) 1 /2)*B*H;

        System.out.println("Area of Triangle : "+result);

    }
}
