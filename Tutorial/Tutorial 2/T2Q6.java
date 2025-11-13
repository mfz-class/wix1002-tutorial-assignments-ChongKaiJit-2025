import java.util.Scanner;

public class T2Q6 {
    public static void main (String[] args) {
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the diameter of your circle: ");

        double diameter = sc.nextDouble();

        double circumference = diameter*pi;
        System.out.printf(" The circumference of your circle is: %.3f", circumference);
    }
}