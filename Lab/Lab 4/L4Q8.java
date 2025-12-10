import java.util.Random;
import java.util.Scanner;

public class L4Q8 {
    public static void main (String[] arg) throws InterruptedException {
        Random rand = new Random();
        
        int x = rand.nextInt(100)+1;
        System.out.print("Random integer: ");
        Thread.sleep(1000);
        System.out.printf("%d%n", x);
        System.out.printf("The first %d prime numbers :%n", x);

        int count = 0;
        int num = 2;
        while (count < x) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
        