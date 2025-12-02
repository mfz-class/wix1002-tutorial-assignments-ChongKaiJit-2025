import java.util.Scanner;

public class T3Q1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an upper case.");
        }

        else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lower case.");
        }
        sc.close();
    }
}