import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to leap Year Calculator.");

        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        if(year /4 ==0){
            System.out.println(year + " is a Leap Year");
        }
    }
}
