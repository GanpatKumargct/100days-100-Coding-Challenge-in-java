import java.util.Scanner;

class MultiplicationTable {
    public void table(){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();

        for(int i=1; i <=10; i++){
            System.out.println(num+" X "+i+" = "+num*i);

        }


    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.table();
    }

}
