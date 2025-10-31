import java.util.Random

public class descend {
    public static void main (String[] args) {
        Random rand = new Random();

        for (int i=1; i <= 5; i++) {
            Int num = rand.nextInt(100) + 1;
            Int x = 100;

            if(num < x)
            x = num;
            num += " ";

        }
        System.out.println("5 numbers generated: " + num);
    }
}
