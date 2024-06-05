import java.util.Scanner;

class arthemeticOperatorSwitch {

    public  void inputnum(){
        {
            System.out.println("Welcome to Calculator");
        }


    }
    public static void calculator(int num1, int num2){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operation(like +,-,*,/)");
        String operation = sc.next();

        int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            case "%" -> num1%num2;
            default -> -1;

        };

        System.out.println("The answer is : "+result);


    }

    public static void main(String[] args) {
        arthemeticOperatorSwitch ar = new arthemeticOperatorSwitch();
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        int num1 = input.nextInt();

        System.out.println("Enter the num2 : ");
        int num2 = input.nextInt();

        calculator(num1,num2);
    }
}
