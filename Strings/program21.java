//Program to find all the permutations of a string
class StringPermutations 
{
    public static void main(String[] args) {
        String inputString = "four";
        findPermutations(inputString, "");
    }

    public static void findPermutations(String input, String current) {
        int length = input.length();

        // If the input string is empty, we've formed a permutation
        if (length == 0) {
            System.out.println(current);
        } else {
            for (int i = 0; i < length; i++) {
                char currentChar = input.charAt(i);
                String remaining = input.substring(0, i) + input.substring(i + 1);
                findPermutations(remaining, current + currentChar);
            }
        }
    }
}