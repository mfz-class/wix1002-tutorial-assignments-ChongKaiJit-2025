import java.util.Scanner;

public class T4Q1d {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = sc.nextInt();
        int x = 0;

        for (int i = 1; i <= limit; i++) {
            x += i;
        }
        System.out.printf("The sum of numbers from 1 to %d is %d.", limit, x);
    }
}