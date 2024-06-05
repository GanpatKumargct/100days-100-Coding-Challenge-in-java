import java.util.Scanner;

class LCM {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N1 = input.nextInt();

        System.out.print("Enter the number : ");
        int N2 = input.nextInt();

        int i = 1;
        while(i <= N2){
            int factor = N1*i;
            if(factor%N2 == 0){
                System.out.println("The lcm of "+N1+" and "+N2+" is : "+factor);
                break;
            }

            i++;
        }
    }

    public static void main(String[] args) {
        LCM lcm = new LCM();
        lcm.run();
    }
}
