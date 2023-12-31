//Program to remove all occurrences of a given character from input String?

import java.util.Scanner;

class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String result = removeCharacter(inputString, charToRemove);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeCharacter(String inputString, char charToRemove) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (currentChar != charToRemove) {
                stringBuilder.append(currentChar);
            }
        }

        return stringBuilder.toString();
    }
}