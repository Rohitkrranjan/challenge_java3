import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of P , R, T : ");
        double P=input.nextDouble();
        double R=input.nextDouble();
        double T=input.nextDouble();

        System.out.print("Simple interest of P , R ,T is : "+(P*R*T)*0.01);

    }
}
