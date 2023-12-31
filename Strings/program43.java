
//Program to Swapping Pair of Characters
import java.util.Scanner;

class CharacterSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a string: ");
        String userString = scanner.nextLine();

        System.out.print("Enter the first character to swap: ");
        char charToSwap1 = scanner.next().charAt(0);

        System.out.print("Enter the second character to swap: ");
        char charToSwap2 = scanner.next().charAt(0);

        if (userString.contains(String.valueOf(charToSwap1)) && userString.contains(String.valueOf(charToSwap2))) {

            String resultString = swapCharacters(userString, charToSwap1, charToSwap2);
            System.out.println("Original string: " + userString);
            System.out.println("String after swapping characters: " + resultString);
        } else {
            System.out.println("Error: At least one of the characters is not present in the input string.");
        }
    }

    private static String swapCharacters(String inputString, char char1, char char2) {
        StringBuilder swappedString = new StringBuilder();
        for (char ch : inputString.toCharArray()) {
            if (ch == char1) {
                swappedString.append(char2);
            } else if (ch == char2) {
                swappedString.append(char1);
            } else {
                swappedString.append(ch);
            }
        }
        return swappedString.toString();
    }
}