// Program to right rotate the elements of an array
class RightRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int positionsToRotate = 2;
        rightRotate(array, positionsToRotate);

        System.out.print("Rotated Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    private static void rightRotate(int[] arr, int positions) {
        int length = arr.length;

        positions = positions % length;

        int[] temp = new int[positions];

        for (int i = 0; i < positions; i++) {
            temp[i] = arr[length - positions + i];
        }

        for (int i = length - 1; i >= positions; i--) {
            arr[i] = arr[i - positions];
        }

        for (int i = 0; i < positions; i++) {
            arr[i] = temp[i];
        }
    }
}
