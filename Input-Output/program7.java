//Enter the short integer from user using Scanner class
import java.util.Scanner;  
class a  
{  
public static void main(String[] x)   
{  
       //object of the Scanner class  
       Scanner s=new Scanner(System.in);  
       System.out.print("Enter a short integer value: ");  
       //invoking nextShort() method that reads an integer input by keyboard  
       //storing the input number in a variable num  
       int num = s.nextShort();  
       System.out.println("The Short integer entered by the user is: "+num);  
}  
}  