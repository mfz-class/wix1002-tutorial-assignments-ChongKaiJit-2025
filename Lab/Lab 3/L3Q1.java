 import java.util.Scanner;

 public class L3Q1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.print("Enter two integer number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the operand: ");
        String op = sc.nextLine();
        char string = op.charAt(0);
        
        switch (op) {

            case "+":
                c = a + b;
                break;

            case "-":
                c = a - b;
                break;

            case "*":
                c = a * b;
                break;

            case "/":
                c = a / b;
                break;

            case "%":
                c = a % b;
                break;
        }

        System.out.println(a + " " + op.charAt(0) + " " + b + " = " + c);
    }
 }