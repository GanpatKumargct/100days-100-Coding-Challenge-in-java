import java.util.Scanner;

class primeNumberChecker62 {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);

    }

    public static void prime(int num){
        if(num%2 == 0){
            System.out.println(num+" is a prime Number");
        }else{
            System.out.println(num+" is a not prime number");
        }
    }
}
