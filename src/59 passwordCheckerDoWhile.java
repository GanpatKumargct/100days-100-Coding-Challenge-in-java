import java.util.Scanner;

class passwordCheckerDoWhile59{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do{
            System.out.println("Enter Your password : ");
            password = sc.next();
        }while(!isvalidpassword(password));
        System.out.println("Thanks for valid password.");
    }

    public static boolean isvalidpassword(String password){
        return password.length() > 5;
    }
}
