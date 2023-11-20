//Program to find the sum of each row and each column of a matrix
class ary2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] rowSums = new int[rows];
        int[] columnSums = new int[columns];

        // Calculate row sums
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSums[i] += matrix[i][j];
            }
        }

        // Calculate column sums
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                columnSums[j] += matrix[i][j];
            }
        }

        // Print row sums
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        // Print column sums
        System.out.println("\nSum of each column:");
        for (int j = 0; j < columns; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnSums[j]);
        }
    }
}