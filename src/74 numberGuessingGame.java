import java.util.Scanner;

class numberGuessingGame {
    int random;

    numberGuessingGame(){

        random = (int)Math.ceil(Math.random()*100);
    }

    /**
     *
     * @param guessNumber the number player guessed
     * @return
     * - negative if the guess number is small
     * + positive if the guess number is large
     * 0 Zero if the number is equal
     */

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        numberGuessingGame game = new numberGuessingGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between (1-100)  ");
        int num = 0;
        int result;
        do {
            System.out.print("Enter the guess : ");
             num = sc.nextInt();
             result = game.guess(num);
             if(result == 0){
                 System.out.println("Congrats you're a correct.");
             } else if (result<0) {
                 System.out.println("please guess large number ");
             }else{
                 System.out.println("please guess small number");
             }
        }while(result !=0 );
    }
}
