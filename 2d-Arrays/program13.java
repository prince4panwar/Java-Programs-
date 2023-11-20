
//Program to determine whether a given matrix is a sparse matrix

class E
{
   
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 1}
        };

        double threshold = 0.5;

        if (isSparseMatrix(matrix, threshold)) {
            System.out.println("\nThe matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    
}
   
    public static boolean isSparseMatrix(int[][] matrix, double threshold) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int zeroCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        double zeroProportion = (double) zeroCount / (rowCount * colCount);

        return zeroProportion >= threshold;
    }
}

