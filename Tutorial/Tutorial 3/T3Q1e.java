import java.util.Scanner;

public class T3Q1e {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        while (x < 0 || x > 6) {
            System.out.print("Invalid case! Please enter a number from 1 - 6... : ");
            sc.nextInt();
        }

        switch(x) {
            case 1: 
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4: 
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7: 
                System.out.println("Sunday");
                break;
        }
    }
}