//Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class exception4 {
    class PositiveNumberException extends Exception {
        public PositiveNumberException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        File filename = new File("numbers.txt");

        try {
            new exception4().checkPositiveNumbers(filename);
            System.out.println("No positive numbers found.");
        } catch (PositiveNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    void checkPositiveNumbers(File filename) throws IOException, PositiveNumberException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    throw new exception4.PositiveNumberException("Positive number found: " + number);
                }
            }
            reader.close();
        } catch (FileNotFoundException e){
            throw new IOException("The specified file was not found.", e);
        }
    }
}