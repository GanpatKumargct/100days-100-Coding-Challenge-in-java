import java.util.Scanner;

class Year57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month in NUmber : ");
        int month = input.nextInt();
        Year57 y = new Year57();
        y.yearDetecor(month);
    }

    public void yearDetecor(int month){
        {
            System.out.println("Welcome to month Detector");
        }
        String result = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };

        System.out.println("The month Name "+result);

    }
}
