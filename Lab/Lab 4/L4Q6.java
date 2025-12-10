import java.util.Scanner;
import java.util.Random;

public class L4Q6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt() & Integer.MAX_VALUE;
        String num = String.valueOf(number);
        int length = num.length();

        System.out.printf("Integer: %d%nNumber of digits in the integer: %d%n", number, length);
    }
}