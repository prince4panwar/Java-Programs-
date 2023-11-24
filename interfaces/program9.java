//Write a Java program to create an interface Searchable with a method search(String keywordss) that searches for a given keywordss in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method. 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

interface Searchable
{
    public void search(String keywordss);
}
class Document implements Searchable
{
    public void search(String keywordss)
    {
        String keyword = "your_keyword_here"; // Replace with the keywordss you want to search for
        String filePath = "data.txt"; // Replace with the path to your text document

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(keywordss)) {
                    System.out.println("Found '" + keywordss + "' on line " + lineNumber + ": " + line);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
class WebPage implements Searchable
{
    public void search(String keywordss)
    {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the URL of the web page: ");
        String urlString = scanner.nextLine();
        System.out.print("Enter the keyword to search for: ");
        String keyword = scanner.nextLine();

        try {
            // Create a URL object to represent the web page
            URL url = new URL(urlString);

            // Open a connection to the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            int lineNumber = 0;
            int keywordCount = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(keyword)) {
                    keywordCount++;
                    System.out.println("Found '" + keyword + "' on line " + lineNumber + ": " + line);
                }
            }

            reader.close();

            if (keywordCount == 0) {
                System.out.println("Keyword '" + keyword + "' not found on the web page.");
            } else {
                System.out.println("Found '" + keyword + "' " + keywordCount + " times on the web page.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while accessing the web page: " + e.getMessage());
        }
    }
}
class check {
    public static void main(String[] args) {
        Document d = new Document();
        WebPage w = new WebPage();
        d.search("one");
        w.search("one");
    }
}