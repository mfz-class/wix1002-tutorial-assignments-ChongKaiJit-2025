import java.util.Scanner;

public class T3Q5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year%4 == 0 || year%400 == 0) && year%100 != 0) {
            System.out.println("A Leap year.");
        }
        else {
            System.out.println("Not a Leap year.");
        }
    }
}