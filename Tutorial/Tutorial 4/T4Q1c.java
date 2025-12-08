import java.util.Random;

public class T4Q1c {
    public static void main (String[] args) {
        int[][] arr = new int[4][5];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rand.nextInt(101);
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}