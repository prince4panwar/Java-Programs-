//program that performs matrix multiplication using multiple threads.
class program4 {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Display the result matrix
        System.out.println("Resultant Matrix:");
        displayMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] result = new int[rowsA][columnsB];

        // Create threads to perform multiplication
        Thread[][] threads = new Thread[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                threads[i][j] = new Thread(new MultiplicationTask(matrixA, matrixB, result, i, j, columnsA));
                threads[i][j].start();
            }
        }

        // Wait for all threads to complete
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

class MultiplicationTask implements Runnable {
    private final int[][] matrixA;
    private final int[][] matrixB;
    private final int[][] result;
    private final int row;
    private final int column;
    private final int columnsA;

    public MultiplicationTask(int[][] matrixA, int[][] matrixB, int[][] result, int row, int column, int columnsA) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
        this.row = row;
        this.column = column;
        this.columnsA = columnsA;
    }

    public void run() {
        int columnsB = matrixB[0].length;
        int sum = 0;
        for (int i = 0; i < columnsA; i++) {
            sum += matrixA[row][i] * matrixB[i][column];
        }
        result[row][column] = sum;
    }
}
