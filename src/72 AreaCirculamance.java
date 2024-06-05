import java.util.Scanner;

class AreaCirculamance {
    static {
        System.out.println("Welcome the Area & Circumference calculator");
    }
    public static double area(float r){
        double rad = Math.PI*Math.pow(r,2);
        return rad;
    }

    public static double circumference(float r){
        double cir = 2*Math.PI*r;
        return cir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the circle of the radius : ");
        float radius = sc.nextFloat();

        double CircleArea = AreaCirculamance.area(radius);
        double CircleCircumference = AreaCirculamance.circumference(radius);
        System.out.println("Area : "+CircleArea);
        System.out.println("Circumference : "+CircleCircumference);
    }
}
