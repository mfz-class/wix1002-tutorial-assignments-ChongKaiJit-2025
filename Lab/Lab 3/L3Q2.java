import java.util.Scanner;
import java.util.Random;

public class L3Q2 {
    public static void main (String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(6);

        switch (x) {
            case 1:
                System.out.print(x + " is one.");
                break;

            case 2:
                System.out.print(x + " is two.");
                break;

            case 3:
                System.out.print(x + " is three.");
                break;

            case 4:
                System.out.print(x + " is four.");
                break;

            case 5:
                System.out.print(x + " is five.");
                break;
        }
    }
}