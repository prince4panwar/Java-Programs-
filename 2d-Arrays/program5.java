//Program to determine whether two matrices are equal

class D
{

    
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        if (areMatricesEqual(A, B)) {
            System.out.println("\nMatrices A and B are equal.");
        } else {
            System.out.println("Matrices A and B are not equal.");
        }
  }
       

    
    public static boolean areMatricesEqual(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}