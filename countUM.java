import java.util.Scanner;

public class countUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence...");
        String sentence = sc.nextLine();

        int countU = 0, countM = 0;

        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == 'U' || ch == 'u')
                countU++;
            else if (ch == 'M' || ch == 'm')
                countM++;
        }

        System.out.printf("Number of U in your sentence : %d%nNumber of M in your sentence : %d%n", countU, countM);
    }
}