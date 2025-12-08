import java.util.Scanner;

public class L3Q5 { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;

        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
        System.out.print("Enter d: ");
        d = sc.nextInt();
        System.out.print("Enter e: ");
        e = sc.nextInt();
        System.out.print("Enter f: ");
        f = sc.nextInt();
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));

        if (((a*d)-(b*c)) == 0) {
            System.out.print("The equation has no solution");
        }

        else {
            System.out.printf("x = %.2f%ny = %.2f%n", x, y);
        }
        sc.close();
    }
}