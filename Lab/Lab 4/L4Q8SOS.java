import java.util.Random;
import java.util.Scanner;

public class L4Q8SOS {
    public static void main (String[] arg) throws InterruptedException {
        Random rand = new Random();
        
        int x = rand.nextInt(100)+1;
        System.out.print("Random integer: ");
        Thread.sleep(1000);
        System.out.printf("%d%n", x);
        System.out.printf("The first %d prime numbers :%n", x);      

        
        int count = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            int divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                    System.out.println(i);
                    count++;
            }
            if (count == x) {
                break;
            }
        }
    }
}