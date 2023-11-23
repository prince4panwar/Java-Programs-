 //Program to Find Largest Number in an array
 class findlargestarrayelement {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 25, 30, 75};

        int largestNumber = findLargestNumber(numbers);
        System.out.println("The largest number in the array is: " + largestNumber);
    }

    public static int findLargestNumber(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

