//  Program to Insert a string into another string

import java.util.Scanner;

class String32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the main string from the user
        System.out.print("\nEnter the main string: ");
        String mainString = scanner.nextLine();

        // Get the string to be inserted
        System.out.print("Enter the string to insert: ");
        String insertString = scanner.nextLine();

        // Get the index at which to insert the string
        System.out.print("Enter the index to insert the string: ");
        int index = scanner.nextInt();

        // Check if the index is within the valid range
        if (index >= 0 && index <= mainString.length()) {
            // Insert the string and display the result
            String resultString = insertStringIntoMainString(mainString, insertString, index);
            System.out.println("Result: " + resultString);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }

        scanner.close();
    }

    private static String insertStringIntoMainString(String mainString, String insertString, int index) {
        // Concatenate the substrings before and after the insertion point
        return mainString.substring(0, index) + insertString + mainString.substring(index);
    }
}