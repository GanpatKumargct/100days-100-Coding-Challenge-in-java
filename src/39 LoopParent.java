import java.util.Scanner;

class LoopParent {
    public void leftpyramid(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = input.nextInt();
        System.out.println("left half pyramid");
        int rows = 0;
        while (rows < n){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            rows++;
            System.out.println();
        }
    }
    public void reversedleftpyramid(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = input.nextInt();
//        int rows=n;
        System.out.println("leftreversed half pyramid");
        for(int rows = 1; rows<=n; rows++){
            System.out.print("*");
            for(int i = n; i>rows; i--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /*int rows = n;
        while (rows > n){
            System.out.print("*");
            int i = n;
            while (i > rows){
                System.out.print(" *");
                i--;
            }
            rows--;
            System.out.println();
        }*/

    }

    public static void main(String[] args) {
        LoopParent lp = new LoopParent();
        lp.leftpyramid();
        lp.reversedleftpyramid();
    }
}
