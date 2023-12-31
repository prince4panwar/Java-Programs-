
//Program to count the total number of vowels and consonants in a string
import java.util.Scanner;

class count {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String input = s.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
    }
}