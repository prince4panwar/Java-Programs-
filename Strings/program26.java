
//Program to find the frequency of characters
import java.util.Scanner;

class spro4 {
  public static void main(String st[]) {
    String str = "hello world";
    int count = 0;
    System.out.println("\nString is :" + str);
    System.out.print("Enter a character to find its frequency: ");
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);

    for (int i = 0; i < str.length(); i++) {
      if (c == str.charAt(i)) {
        count++;
      }
    }
    System.out.println("Frequency of " + c + " in the string is: " + count);
  }
}