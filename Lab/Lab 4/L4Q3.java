import java.util.Scanner;
import java.lang.Math;

public class L4Q3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = 0;
        double totalscore = 0;
        double avg = 0;
        double sdv = 0;
        double min = 100;
        double max = 0;

        double countscore = 0;
        double inputsqr = 0;
        double sum_inputsqr = 0;
        
        while (true) {
            
            System.out.print("Enter a score [negative score to quit]: ");
            input = sc.nextInt();

            if (input < 0) {
                break;
            }
            else {
                countscore++;
                totalscore += input;
                inputsqr = totalscore*totalscore;
                sum_inputsqr += input*input;

                if (input > max) 
                    max = input;
                
                if (input < min) 
                    min = input;
                
            }
        }
        avg = totalscore/countscore;
        sdv = Math.sqrt(((sum_inputsqr)-((totalscore*totalscore)/countscore))/countscore - 1);

        System.out.printf("Minimum score: %.0f%n", min);
        System.out.printf("Maximum score: %.0f%n", max);
        System.out.printf("Average score: %.2f%n", avg);
        System.out.printf("Standard Deviation: %.2f%n", sdv);
    }
}