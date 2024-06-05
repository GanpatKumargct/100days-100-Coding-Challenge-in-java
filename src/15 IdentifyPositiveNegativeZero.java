import java.util.Scanner;

class IdentifyPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        if(num>0){
            System.out.println(num+" is a Positive number");
        } else if (num<0) {
            System.out.println(num+" is a negative number");
        }else {
            System.out.println(num+" Zero");
        }
    }
}
