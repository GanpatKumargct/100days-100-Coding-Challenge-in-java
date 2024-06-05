import java.util.Scanner;

class inputUser {

     public static void main(String[] args) {
         {
             System.out.println("Welcome to Your Game.......!");
         }
         Scanner sc = new Scanner(System.in);
/*
         do{
             System.out.println("Enter Your input : ");
             String hars = sc.nextLine();
         }while(String)
*/

         for (int i =0; true; i++){
             System.out.print("Enter the input : ");
             String Str = sc.next();
             if(Str.equals("Sita") ){
                 break;
             }
         }

         /*while(true){
             System.out.print("Enter the input : ");
             String Str = sc.next();
             if(Str.equals("Sita") ){
                 break;
             }
         }*/
         System.out.println("You have successfully completed the program..!");
     }
}
