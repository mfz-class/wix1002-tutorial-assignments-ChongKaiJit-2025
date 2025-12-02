import java.util.Scanner;

public class T3Q1b {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of x: ");
        int x = sc.nextInt();

        if (x%2 == 0) {
            System.out.println("x is an even number.");
        }
        else {
            System.out.println("x is an odd number.");
        }
    }
}