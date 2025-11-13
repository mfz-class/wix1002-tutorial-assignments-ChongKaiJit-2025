import java.util.Scanner;

public class T2Q7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many inches? : ");
        double i = sc.nextDouble();

        double cm = i * 2.54;
        System.out.printf("The length in centimeters is: %.2f cm", cm);
    }
}