import java.util.Random;

public class descend {
    public static void main (String[] args) {
        Random rand = new Random();
        int[] num = new int[5];

        System.out.print("5 numbers generated: " );

        for (int i=0; i < num.length; i++) {
            num[i] = rand.nextInt(100) + 1;
            System.out.print(num[i] + " ");
        }

        for (int i = 0; i < num.length - 1 ; i++) {
            for (int j = 0; j < num.length - 1 - i ; j++) {
                if (num[j] < num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print( "\nNumbers in descending order: " );
        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
    
