// Program to display the upper triangular matrix
import java.util.Scanner;

class uppertriangularmatrix 
{
    public static void main(String[] a) {
                
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter the number of rows and columns for the square matrix: ");
        int n = s.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        } 

        }
}