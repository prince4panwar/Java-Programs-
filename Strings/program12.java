
//Program to Convert String to String Array
import java.util.Scanner;
import java.util.Arrays;

class StringToArray {
    public static void main(String args[]) {
        System.out.println("\nProgram to Convert String To String Array\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value : ");
        String str = sc.nextLine();
        String[] StringArray = str.split(",");
        for (String s1 : StringArray) {
            System.out.println("Convert string To ArrayString is : " + s1);
        }
        System.out.println("Convert string To ArrayString is : " + Arrays.toString(StringArray));
    }
}