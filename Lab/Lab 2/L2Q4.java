import java.util.Scanner;

public class L2Q4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = sc.nextInt();
        int hour = sec / 3600;
        int minute = (sec % 3600) / 60;
        int sec2 = sec % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds.", sec, hour, minute, sec2);
    }
}