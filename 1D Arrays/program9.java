//Program to print the largest element in an array
import java.util.Scanner;
class largestelement {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);

    }
}
