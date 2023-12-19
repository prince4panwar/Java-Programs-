//Java method to count the number of digits in an integer with the value 2. The integer may be assumed to be non-negative.
class DigitCounter
 {
    public static int countTwos(int number) {
        String numberStr = String.valueOf(number);
        int count = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == '2') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 22253;
        int numberOfTwos = countTwos(number);

        System.out.println("The number of 2s in " + number + " is: " + numberOfTwos);
    }
}