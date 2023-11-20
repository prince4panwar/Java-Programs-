//Program to find the transpose of a given matrix
class Transpose 
{
    public static void main(String[] args) 
    {
        int rows = 3, columns = 3;

        // Initialize a matrix
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Create a matrix to store the transpose
        int[][] transpose = new int[columns][rows];

        // Find the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        // Display the transpose matrix
        System.out.println("\nTranspose of the Matrix:");
        displayMatrix(transpose);
    }

    // Helper method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}