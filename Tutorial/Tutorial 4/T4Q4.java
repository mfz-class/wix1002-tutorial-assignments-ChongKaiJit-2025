import java.util.Scanner;

public class T4Q4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string... : ");
        String input = sc.nextLine();

        int length = input.length();

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(length - 1 - i);
            System.out.print(ch);
        }
    }
}