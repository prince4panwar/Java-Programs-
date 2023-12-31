
//Program to find the most repeated word in a text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class wordfinder {

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the path to the text file: ");
        String filePath = s.nextLine();

        try {
            String mostRepeatedWord = findMostRepeatedWord(filePath);
            System.out.println("The most repeated word in the file is: " + mostRepeatedWord);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static String findMostRepeatedWord(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }

            }
        }

        reader.close();
        String mostRepeatedWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostRepeatedWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostRepeatedWord;
    }
}
