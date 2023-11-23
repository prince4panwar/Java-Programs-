//How to Sort an Array in Java
import java.util.Arrays;

class SingleDimensionArray23 {
    public static void main(String[] args) {

        // example arrays =>

        int[] intArray = {10,91,60,51,9,6};

        String[] stringArray = {"laptop","CPU","Monitor","Keyboard","Mic"};

        // sorting via Array.sort() 
        System.out.println("\nOriginal Array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted int array in ascending order: " + Arrays.toString(intArray));

       System.out.println("\nOriginal Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array in ascending order: " + Arrays.toString(stringArray));
    }
}
