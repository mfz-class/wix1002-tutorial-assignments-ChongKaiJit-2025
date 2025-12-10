import java.util.Scanner;
import java.util.Random;

public class L4Q5 {
    public static void main (String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll your dices! Enter R to continue... ");
        String input = sc.nextLine();

        while (!input.equalsIgnoreCase("r")) {
            System.out.print("Enter R to continue... ");
            input = sc.nextLine();
        }
        System.out.println("Player who first reaches 100 score or more wins!");
        Thread.sleep(1000);
        System.out.println("GAME START!");

        int player1 = 0;
        int player2 = 0;
        int roll_p1 = 0;
        int roll_p2 = 0;
        int p1_score = 0;
        int p2_score = 0;
        while (p1_score < 100 && p2_score < 100) {
            while (p1_score < 100 && p2_score < 100) {
                System.out.print("Enter R to roll the dice... ");
                input = sc.nextLine();

                while (!input.equalsIgnoreCase("r")) {
                    System.out.print("Enter R to roll... ");
                    input = sc.nextLine();
                }
                roll_p1 = rand.nextInt(6)+1;
                roll_p2 = rand.nextInt(6)+1;
                p1_score += roll_p1;
                p2_score += roll_p2;

                System.out.printf("Player 1: %d%nPlayer 2: %d%n", roll_p1, roll_p2);
                System.out.printf("%nScore: %nPlayer 1: %d%nPlayer 2: %d%n%n", p1_score, p2_score);

                // Extra turn for rolling a 6
                if (roll_p1 == 6 || roll_p2 == 6) {
                    //break at >=100 before going to another round
                    if (p1_score >= 100 && p1_score > p2_score) {
                            System.out.println("Player 1 wins!!!");
                            break;
                        }
                    if (roll_p1 == 6) {
                        System.out.print("Player 1 just got a 6! Enter R to roll again!");
                        input = sc.nextLine();

                        while (!input.equalsIgnoreCase("r")) {
                            System.out.print("Enter R to roll... ");
                            input = sc.nextLine();
                        }
                        roll_p1 = rand.nextInt(6)+1;
                        p1_score += roll_p1;
                        System.out.printf("Player 1 (Chance): %d%n", roll_p1);
                        System.out.printf("%nScore: %nPlayer 1: %d%nPlayer 2: %d%n%n", p1_score, p2_score);
                    }

                    else if (roll_p2 == 6) {
                        //break at >=100 before going to another round
                        if (p2_score >= 100 && p2_score > p1_score) {
                            System.out.println("Player 2 wins!!!");
                            break;
                        }
                        System.out.print("Player 2 just got a 6! Enter R to roll again!");
                        input = sc.nextLine();

                        while (!input.equalsIgnoreCase("r")) {
                            System.out.print("Enter R to roll... ");
                            input = sc.nextLine();
                        }
                        roll_p2 = rand.nextInt(6)+1;
                        p2_score += roll_p2;
                        System.out.printf("Player 2 (Chance): %d%n", roll_p2);
                        System.out.printf("%nScore: %nPlayer 1: %d%nPlayer 2: %d%n%n", p1_score, p2_score);
                    }
                
                }
                if (p1_score >= 100 && p1_score > p2_score) {
                    System.out.println("Player 1 wins!!!");
                }
                else if (p2_score >= 100 && p2_score > p1_score) {
                    System.out.println("Player 2 wins!!!");
                }
            }
        }
    }
}