import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value of x ");
        int x=input.nextInt();
        System.out.println("Please enter a value of y");
        int y = input.nextInt();

        int sum = x+y;
        System.out.println("Sum of x and y is "+sum);
        int sub = x-y;
        System.out.println("Sub of x and y is "+sub);
        int prod = x*y;
        System.out.println("Prod of x and y is "+prod);
        int div = x/y;
        System.out.println("Divide of x and y is "+div);
        int mod = x%y;
        System.out.print("Mod of x and y is "+mod);
    }
}