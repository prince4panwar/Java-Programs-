//How to convert boolean to String
import java.util.Scanner;

class booleantostring {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a boolean value (true or false): ");
        String booleanInput = s.nextLine();

        boolean booleanValue = Boolean.parseBoolean(booleanInput);
        String stringResult = booleanToString(booleanValue);

        System.out.println("String equivalent: " + stringResult);
    }

    private static String booleanToString(boolean booleanValue) {
        return String.valueOf(booleanValue);
    }
}
