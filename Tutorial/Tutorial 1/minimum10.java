import java.util.Random;

public class minimum10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 100; // assume numbers between 1 and 100

        System.out.println("Generated numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100) + 1; // 1–100
            System.out.print(num + " ");

            if (num < min) {
                min = num;
            }
        }

        System.out.println("\nMinimum number: " + min);
    }
}