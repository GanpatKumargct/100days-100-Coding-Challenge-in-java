import java.util.Scanner;

class ReverseNumber {
    public void reverse(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Num = input.nextInt();

        int newnum = 0;
        while(Num > 0){
            int digit = Num%10;
            newnum = (newnum*10)+digit;
            Num/=10;
        }
        System.out.println("The Reverse digit is : "+newnum);
    }

    public static void main(String[] args) {
        ReverseNumber rn = new ReverseNumber();
        rn.reverse();
    }
}
