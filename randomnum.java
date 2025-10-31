import java.util.Random;

public class randomnum {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber1 = rand.nextInt(6) + 1; 
        int randomNumber2 = rand.nextInt(6) + 1; 
        System.out.println("Dice 1: " + randomNumber1);
        System.out.println("Dice 2: " + randomNumber2);
        if (randomNumber1 > randomNumber2) {
            System.out.println("Player 1 wins");
        }
        else if (randomNumber1 == randomNumber2) {
            System.out.println("DRAW");
        }
        else {
            System.out.println("Player 2 wins");
        }
    }
}