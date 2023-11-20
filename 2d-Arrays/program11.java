// Program to determine whether a given matrix is an identity matrix
import java.util.Scanner;
class IdentityMatrixChecker 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the order of the square matrix: ");
        int order = scanner.nextInt();
        int[][] matrix = new int[order][order];

        System.out.println("Enter elements of the square matrix:");
        enterMatrixElements(scanner, matrix);

        boolean isIdentity = isIdentityMatrix(matrix);

        if (isIdentity) {
            System.out.println("The entered matrix is an Identity Matrix.");
        } else {
            System.out.println("The entered matrix is NOT an Identity Matrix.");
        }
    }

    private static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static boolean isIdentityMatrix(int[][] matrix) {
        int order = matrix.length;

        if (order != matrix[0].length) {
            return false;
        }
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}