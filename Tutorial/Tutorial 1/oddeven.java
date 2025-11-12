import java.util.Random;

public class oddeven {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        String row1 = " ";
        String row2 = " ";

        System.out.println("Generated numbers:");


        for (int i = 1; i <= 10; i++) {
            int min = 10;
            int max = 100;
            int num = rand.nextInt(max - min + 1) + min; // where rand.nextInt(max-min+1) is one number generated 
            System.out.print(num + " ");

            if (num%2 == 0) {
                row1 += num + " ";
            }
            else {
               row2 += num + " ";
            }
        }
        System.out.println("\nLoading...(33%)");
        Thread.sleep(1000);
        System.out.println("Loading...(67%)");
        Thread.sleep(1000);
        System.out.println("Loading...(100%)");
        Thread.sleep(500);
        System.out.printf("\nEven number: %s%nOdd number: %s%n", row1, row2);
    }
}