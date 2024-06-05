import java.util.Scanner;

class PrimeNumber {
    public void prime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Num = input.nextInt();

        for(int i = 2; i < Num; i++){
            if(Num%i==0){
                System.out.println(Num+" is a not a prime number");
                break;
            }
            else{
                System.out.println(Num+" is a not a prime number");
                break;
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber pm = new PrimeNumber();
        pm.prime();
    }
}
