// Program to insert the string using StringBuffer class

class prog6 {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        // Print the original StringBuffer
        System.out.println("\nOriginal StringBuffer: " + stringBuffer);

        // String to insert
        String toInsert = "World!";

        // Index at which to insert the string
        int insertIndex = 7;

        // Insert the string into the StringBuffer
        stringBuffer.insert(insertIndex, toInsert);

        // Print the modified StringBuffer
        System.out.println("Modified StringBuffer: " + stringBuffer);
    }
}