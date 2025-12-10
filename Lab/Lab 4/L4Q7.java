import java.util.Scanner;

public class L4Q7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double M = 0; //Monthly Payment
        double C = 0; //Principal portion due
        double n = 0; //Number of month under consideration
        double L = 0; //Interest due
        double R = 0; //Remaining principal balance due
        double I = 0; //Total interest

        System.out.print("Enter principal amount: ");
        double P = sc.nextInt(); //Principal
        System.out.print("Enter interest in %: ");
        double i = sc.nextInt(); //Interest rate 
        System.out.print("Enter total number of month(s): ");
        double N = sc.nextInt(); //Total number of months
        
        Mort(N, M, P, C, L, i, R, I);
    }
    public static void Mort(double N, double M, double P, double C, double L, double i, double R, double I) {
        System.out.printf("%-10s %-15s %-12s %-10s %-15s %-10s%n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        double totalInterest = 0;

        for (double n = 1; n <= N; n++) {
            double i_percent = 0;
            i_percent = i/(12*100);
            M = (P*i_percent)/(1-(Math.pow((1+i_percent),-N)));
            C = M*(Math.pow((1+i_percent),(-(1+N-n))));
            L = M - C;
            R = (L/i_percent) - C;
            totalInterest += L;

            if (R < 0) {
                R = 0;
            }
            System.out.printf("%-10.0f %-15.2f %-12.2f %-10.2f %-15.2f %-10.2f%n", n, M, C, L, R, totalInterest);
        }
    }
}