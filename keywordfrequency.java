import org.jsoup.jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.Scanner;

public class keywordfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a webpage URL: ");
            String url = sc.nextLine();

            System.out.print("Enter a keyword to search: ");
            String keyword = sc.nextLine().toLowerCase();

            // Fetch and parse webpage content
            Document doc = Jsoup.connect(url).get();

            // Extract plain text from the HTML
            String text = doc.text().toLowerCase();

            // Count occurrences
            int count = 0;
            int index = text.indexOf(keyword);
            while (index != -1) {
                count++;
                index = text.indexOf(keyword, index + keyword.length());
            }

            System.out.println("The keyword \"" + keyword + "\" appears " + count + " time(s) in the webpage.");

        } catch (IOException e) {
            System.out.println("Error fetching webpage: " + e.getMessage());
        }

        sc.close();
    }
}