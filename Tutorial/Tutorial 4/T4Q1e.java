import java.util.Scanner;

public class T4Q1e {
    public static void main (String[] args) {
        double i = 1;
        double j = 25;
        double x = 0;

        do {
            x += i/j;
            i++;
            j--;
        } while (i <= 25 && j >= 1);
        System.out.printf("%.2f%n", x);
    }
}