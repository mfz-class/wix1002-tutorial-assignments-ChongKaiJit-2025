import java.util.Scanner;

public class T3Q1d {
    public static void main(String[] args) {
        String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = sc.next();
        System.out.print("Enter String 2: ");
        String str2 = sc.next();

        if (str1.charAt(0) == str2.charAt(0)) {
            System.out.printf("%n%s %n%s", str1, str2);
        }
        else if (ch.indexOf(str1.charAt(0)) < ch.indexOf(str2.charAt(0))) {
            System.out.printf("%n%s %n%s", str1, str2);
        }
        else {
            System.out.printf("%n%s %n%s", str2, str1);
        }
        sc.close();
    }
}
