// How to convert long to String
import java.util.Scanner;
class StringToFloat
{  
public static void main(String args[])
{ 
try
{
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter the string numeric value : ");
String s=sc.nextLine();  
float f=Float.parseFloat(s);  
System.out.println("float value is : "+f);  
}
catch(NumberFormatException e)
{
System.out.print("Invalid Input");
}  
}
}