
//Program to count the total number of characters in a string
import java.util.Scanner;

class CountCharToString {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        int charactercount = str.length();
        System.out.println("Total number of character in a string : " + charactercount);
    }
}
