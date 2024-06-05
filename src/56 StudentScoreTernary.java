import java.util.Scanner;

class StudentScoreTernary56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your marks (0-100) : ");
        int marks = input.nextInt();

        String Grade = marks >=80? "High":(marks>=50? "Moderate": "low") ;
        System.out.println("YOur Grade is "+Grade);
    }
}
