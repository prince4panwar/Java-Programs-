// How to convert double to String
import java.util.Scanner;
class DoubleToString
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter a double number: "); 
double num = sc.nextDouble();
String str = Double.toString(num);
System.out.println("Converted String: " + str);   
}
}