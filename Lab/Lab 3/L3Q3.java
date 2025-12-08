import java.util.Scanner;

public class L3Q3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sales Volume: ");
        int sales = sc.nextInt();
        double comm = 0;

        while (sales < 0) {
            System.out.println("Please enter a positive number of sales volume!");
            sales = sc.nextInt();
        }

        if (sales <= 100) {
            comm = sales * 0.05;
        }
        else if (sales > 100 && sales <= 500) {
            comm = sales * 0.075;
        }
        else if (sales > 500 && sales <= 1000) {
            comm = sales * 0.1;
        }
        else if (sales > 1000) {
            comm = sales * 0.125;
        }

        System.out.printf("Commision: %.2f%n", comm);
    }
}