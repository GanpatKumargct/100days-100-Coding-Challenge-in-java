import java.util.Scanner;

class PalindromeNumber {
    public void palindrome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Num = input.nextInt();
        int original_number = Num;


        int reversedNum = 0;
        while(Num > 0){
            int digit = Num%10;
            reversedNum = (reversedNum*10)+digit;
            Num/=10;
        }
//        int reverse = ;
        System.out.println("The Reverse digit is : "+reversedNum);

        if(original_number== reversedNum){
            System.out.println("is a palindrome number");
        }
        else{
            System.out.println("is not a palindrome number");
        }

    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        pn.palindrome();
    }
}
