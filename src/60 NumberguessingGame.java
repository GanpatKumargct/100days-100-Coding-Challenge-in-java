import java.util.Scanner;

 class NumberguessingGame60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = 5, guess;
        do{
            System.out.println("Please Guess the number (0-10)");
            guess = sc.nextInt();
        }while(guess!=num);
        System.out.println("You have successfully guessed number");
    }
}
