import java.util.Scanner;

public class arrayInput {
    public static int[] userinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number of element in the array : ");
        int size = sc.nextInt();
        int[] numarray = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the number "+(i+1)+ ": ");
            numarray[i] = sc.nextInt();


        }
        return numarray;
    }
}
