
//Program to remove all the white spaces from a string
import java.util.Scanner;

class RemoveWhiteSpace {
    public static void main(String args[]) {
        System.out.println("\nProgram to remove all the white spaces from a string.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value : ");
        String str1 = sc.nextLine();
        String result = str1.replaceAll("\\s+", "");
        System.out.println("\nOriginal String  :  " + str1);
        System.out.println("Remove a all the WhiteSpace :  " + result);
    }
}