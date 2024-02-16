import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perimeter calculator ");
        System.out.print("Please enter four sides of rectangle : ");
        double  a = input.nextDouble();
        double  b = input.nextDouble();
        double  c = input.nextDouble();
        double  d = input.nextDouble();

        System.out.println("Perimeter of rectangle is : "+(a+b+c+d));


    }
}
