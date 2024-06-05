import java.util.Scanner;

 class even_odd54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        /*if(num%2 == 0){
            System.out.println(num+" is a Even number");
        }else {
            System.out.println(num+" is a Odd number");
        }*/

        String Result = num%2==0? "Even Number":"Odd Number";
        System.out.println("Your Number is "+Result);
    }
}
