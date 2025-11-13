import java.util.Scanner;

public class L2Q1 {
    public static void main (String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit? :");
        double far = sc.nextDouble();

        double cel = (far -32)/1.8;

        System.out.printf("Converting %.2f degree Fahrenheit to Celcius...", far);
        Thread.sleep(2000);
        System.out.printf("%n%.2f degree C(Celcius) %n", cel); 
    }
}