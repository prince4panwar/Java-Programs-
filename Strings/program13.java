//Program to count number of words in a String?
class Count {
    public static void main(String[] args) {
        // Example string
        String inputString = "This is a sample string";

        // Count the number of words
        int wordCount = countWords(inputString);

        // Print the result
        System.out.println("\nOrignal string: " + inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }

    // Function to count words in a string
    private static int countWords(String str) {
        // Check for null or empty string
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string into an array of words
        String[] words = str.split("\\s+");

        // Return the number of words
        return words.length;
    }
}