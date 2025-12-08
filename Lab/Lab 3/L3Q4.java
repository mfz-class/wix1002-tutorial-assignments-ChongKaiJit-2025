import java.util.Scanner;
import java.util.Random;

public class L3Q4 {
    public static void main (String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int p1 = 0;
        int p2 = 0;
        System.out.printf("Roll your dices! %n%n");

        Thread.sleep(2000);

        for (int game = 0; game < 2; game++) {
            System.out.printf("Game %d, enter R to roll your dices! %n", game + 1);
            String start = sc.nextLine();
                while (!start.equalsIgnoreCase("R")) {
                    start = sc.nextLine().toUpperCase();
                }

            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;

            System.out.println("Player 1: " + dice1);
            System.out.println("Player 2: " + dice2);

            if (dice1 > dice2) {
                p1++;
            }
            else {
                p2++;
            }
            System.out.println();
        }

        if (p1 > p2) {
            System.out.println("Player 1 wins!");
        }
        else if (p2 > p1) {
            System.out.println("Player 2 wins!");
        }
        else if (p1 == p2) {
            System.out.println("Draw");
        }
    }
}