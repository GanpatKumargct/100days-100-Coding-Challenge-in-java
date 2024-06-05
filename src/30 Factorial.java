import java.util.Scanner;

class Factorial {
    public void fact(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = input.nextInt();
        long mul =1;
        for(int i=N; i>1; i--){

            mul *= i;
        }
        System.out.println("The factorial of "+N+" is : "+mul);
    }

    public static void main(String[] args) {
        Factorial fb = new Factorial();
        fb.fact();
    }
}
