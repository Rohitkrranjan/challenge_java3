import java.util.Date;
import java.util.Scanner;

public class ProductFloatPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter float value of x");
        double x = input.nextDouble();
        System.out.println("Please enter float value of y");
        double y = input.nextDouble();

        double prod = x*y;

        System.out.println("Product of two float point is  "+prod);

    }
}
