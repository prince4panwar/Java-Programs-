//Enter the float from user using Scanner class
import java.util.Scanner;

 class FloatInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float number: ");

        // Check if the next token entered by the user is a float
        if (scanner.hasNextFloat()) {
            float userInput = scanner.nextFloat();
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println("Invalid input. Please enter a valid float number.");
        }

        // Close the Scanner to release resources
        scanner.close();
    }
}