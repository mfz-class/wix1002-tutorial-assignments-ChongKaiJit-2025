import java.util.Scanner;

public class L4Q4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the start day of the year: ");
        int firstday = sc.nextInt();

        int[] ndaysinMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            ndaysinMonth[1] = 29;
        } 
        
        int startMay = firstday;
        for (int i = 0; i < 4; i++) {
            startMay = (startMay + ndaysinMonth[i]) % 7;
        }

        int startAug = firstday;
        for (int i = 0; i < 7; i++) {
            startAug = (startAug + ndaysinMonth[i]) % 7;
        }

            printMonth("May", year, ndaysinMonth[4], startMay);
            System.out.println();
            printMonth("August", year, ndaysinMonth[7], startAug);

    }
    public static void printMonth(String Month, int year, int numDay, int startDay) {
        System.out.println("        " + Month + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numDay; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}