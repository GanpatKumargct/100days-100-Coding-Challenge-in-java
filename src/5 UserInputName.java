import java.util.Scanner;

class UserInputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String Name = sc.next();

        System.out.printf("Welcome %s to Coding World",Name);
    }

}
