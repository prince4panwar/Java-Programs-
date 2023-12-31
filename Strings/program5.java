
//Program to append the string using StringBuffer class
class pro5 {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuffer s = new StringBuffer("Hello, ");
        System.out.println("\nOriginal String : " + s);
        // Add characters to the string
        s.append("how are you");

        // Print the final string
        System.out.println("Append a String is : " + s.toString()); // Output: "Hello, World!"
    }
}