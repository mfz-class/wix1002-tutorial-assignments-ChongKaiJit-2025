import java.util.Random;
import java.util.Scanner;

public class L2Q5 {
    public static void main (String [] args) throws InterruptedException {
        Random rand = new Random();
        int sum = 0;
        System.out.println("Generating a random number between 0-10000...");
        Thread.sleep(3000);

        //generate number
        int num = rand.nextInt(10000) + 1;
        System.out.printf("Generated number: %d%n", num);

        //converting int to string
        String num1 = Integer.toString(num);

        System.out.println("Calculating sum of all digits...");
        
        //Calculate the sum of digits using for loop and class method
        for (int i = 0; i < num1.length(); i++) {
            int num2 = Character.getNumericValue(num1.charAt(i));
            sum += num2;
        }
        
        Thread.sleep(3000);
        System.out.println("The sum of all digits of the number is " + sum);
    }
}