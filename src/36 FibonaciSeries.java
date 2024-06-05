import java.util.Scanner;

class FibonaciSeries {
    public void fibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Num = input.nextInt();
        int sum = 0;

        System.out.println("Fibonacci Series " + Num + " terms:");
        for (int i = 0; i < Num; i++) {
            System.out.print(calfibo(i) + " ");
        }

    }
    public int calfibo(int n){
        if (n <= 1) {
            return n;
        } else {
            return calfibo(n - 1) + calfibo(n - 2);
        }

    }

    public static void main(String[] args) {
        FibonaciSeries fb = new FibonaciSeries();
        fb.fibonacci();
        
    }

}
