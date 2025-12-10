import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println();
        int x = 0;
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    x += j;
                }
        }
        System.out.printf("The sum of the series: %d%n", x);
    }
}