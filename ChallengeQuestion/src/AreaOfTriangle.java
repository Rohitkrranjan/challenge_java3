import java.util.Scanner;
public class AreaOfTriangle {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the height of triangle : ");
                double h = input.nextDouble();
                System.out.println("Please Enter the base of triangle : ");
                double b = input.nextDouble();

                System.out.print("Area of triangle is : "+(0.5*b*h));
            }
}
