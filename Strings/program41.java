//Program to Splitting into a number of sub-strings
class String41 {
    public static void main(String[] args) {
        String originalString = "hello world";
        int substringLength = 3;

        int numSubstrings = (int) Math.ceil((double) originalString.length() / substringLength);

        for (int i = 0; i < numSubstrings; i++) {
            int start = i * substringLength;
            int end = Math.min((i + 1) * substringLength, originalString.length());

            String substring = originalString.substring(start, end);
            System.out.println("Substring " + (i + 1) + ": " + substring);
        }
    }
}