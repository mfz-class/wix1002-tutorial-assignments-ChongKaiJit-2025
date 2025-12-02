import java.util.Scanner;

public class T3Q4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 integers:");
        System.out.print("Integer x: ");
        int x = sc.nextInt();
        System.out.print("Integer y: ");
        int y = sc.nextInt();
        System.out.print("Integer z: ");
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println("x is the largest number.");
        }
        else if (y > x && y > z) {
            System.out.println("y is the largest number.");
        }
        else if (z > x && z > y) {
            System.out.println("z is the largest number.");
        }
    }
}