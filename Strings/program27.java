
//Program to find the largest and smallest word in a string
import java.util.Scanner;

class WordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");
        String smallestWord = words[0];
        String largestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);

        scanner.close();
    }
}