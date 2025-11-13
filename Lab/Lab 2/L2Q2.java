import java.util.Scanner;

public class L2Q2 {
    public static void main (String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("The price of the car? : RM ");
        double P = sc.nextDouble();
        System.out.print("Downpayment? : RM ");
        double D = sc.nextDouble();
        System.out.print("Interest Rate(%)? : ");
        double R = sc.nextDouble();
        double Rr = R*0.01;
        System.out.print("Loan Period (year)? : ");
        int Y = sc.nextInt();

        double M = (P - D) * (1 +Rr*Y/100) / (Y *12);
        System.out.println("Calculating monthly payment...");
        Thread.sleep(2000);
        System.out.printf("Monthly Payment = RM %.2f%n", M);
    }
}