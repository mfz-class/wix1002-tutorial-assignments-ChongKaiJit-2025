import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Guess a number from 1-10...");
        int num1 = sc.nextInt();

        if (num1 < 0 || num1 > 10) {
            System.out.println("\nPlease enter a valid number!!");
        }
        else {
            System.out.println("Are you ready? Time to reveal your guessing...");

            Thread.sleep(1000);
            Random rand = new Random();
            int num2 = rand.nextInt(10) +1;
            System.out.print("The number is... ");
            Thread.sleep(3000);
            System.out.print(num2);

            Thread.sleep(1000);
            
            if (num1 == num2) {
                System.out.println("\nCongratulations! You are one hella kill!");
            }
            else if (num1 != num2) {
                System.out.println("\nBetter luck another time...");
            }
        }
    }
}
