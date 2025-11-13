import java.util.Random;
import java.util.Scanner;

public class L2Q3 {
    public static void main (String[] args) throws InterruptedException {
        Random rand = new Random();
        int num1 = rand.nextInt(41)+10;
        int num2 = rand.nextInt(41)+10;
        int num3 = rand.nextInt(41)+10;

        System.out.println("Generating 3 random numbers...");
        Thread.sleep(2000);
        System.out.println("Random number 1: "+ num1);
         
        Thread.sleep(700);
        System.out.println("Random number 2: "+ num2);
        
        Thread.sleep(700);
        System.out.println("Random number 3: "+ num3);
        
        Thread.sleep(2000);

        double sum = num1 + num2 + num3;
        double avg = sum/3;
        System.out.printf("The sum of the 3 random numbers is %.0f%n", sum);
        Thread.sleep(1000);
        System.out.printf("The average of these 3 random numbers is %.2f", avg);
    } 
}