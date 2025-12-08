import java.util.Scanner;

public class T4Q3 {
    public static void main (String[] args) {
        int[] f = new int[10];
        f[0] = 1; 
        f[1] = 1;
        System.out.print(f[0] + " " + f[1] + " ");

        for (int i = 2; i < 10; i++) {
            f[i] = f[i - 1] + f[i - 2];
            
            System.out.print(f[i] + " ");
        }
    }
}