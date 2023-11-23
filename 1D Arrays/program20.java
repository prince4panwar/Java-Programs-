//Program to Find Smallest Number in an array
import java.util.Scanner;

class smallestnumber {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        if (n == 0) {
            System.out.println("The array is empty.");
        } else {
            int smallest = arr[0]; 

            for (int i = 1; i < n; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            System.out.println("The smallest element in the array is: " + smallest);
        }

    }
}
