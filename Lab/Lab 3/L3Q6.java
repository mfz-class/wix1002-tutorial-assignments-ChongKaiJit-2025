import java.util.Scanner;
import java.lang.Math;

public class L3Q6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        System.out.printf("%nEnter the coordinate point: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        double area1 = Math.PI*radius*radius;
        double area2 = Math.PI*Math.sqrt((x*x)+(y*y));

        if (area1 >= area2) {
            System.out.println("The coordinate point (" + x + "," + y + ") is inside the circle.");
        }
        else if (area1 < area2) {
            System.out.println("The coordinate point (" + x + "," + y + ") is outside the circle.");
        }
    }
}