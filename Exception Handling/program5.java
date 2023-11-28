// Write a Java program that reads a file and throws an exception if the file is empty.
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

class CheckEmptyFile {
    public static void main(String[] args) {
        try {
            checkFileNotEmpty("data.txt");
        } catch (EmptyFileException e) {
            System.out.println("Empty file detected: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File not found or cannot be read: " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String fileName) throws IOException, EmptyFileException {
        File file = new File(fileName);

        if (!file.exists() || file.length() == 0) {
            throw new EmptyFileException("File is empty or does not exist.");
        }

        FileReader reader = new FileReader(file);
        reader.close();
    }
}