import java.util.Scanner;

public class L2Q6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double gram = sc.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double temp_i = sc.nextDouble();
        temp_i = (temp_i - 32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double temp_f = sc.nextDouble();
        temp_f = (temp_f - 32)/1.8;

        double M = gram/1000;
        double Q = M*((temp_f - temp_i)) * 4184;

        System.out.printf("The energy needed is %e%n Joules", Q);
    }
}