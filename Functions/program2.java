//Java method to compute the average of three numbers.
 class AverageCalculator {
     static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        double number1 = 10.0;
        double number2 = 5.0;
        double number3 = 8.0;

        double average = computeAverage(number1, number2, number3);

        System.out.println("The average is: " + average);
    }
}