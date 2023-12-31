// Program to separate the Individual Characters from a String
class SeparateCharacters {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Using a for loop to separate and print individual characters
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            System.out.println(character);
        }
    }
}