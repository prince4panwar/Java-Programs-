//How to convert String to boolean
import java.util.Scanner;

class convertStringToBoolean
{
    public static void main(String args[])
    {
        System.out.println("\n How to convert String To Boolean.");
        Scanner sc= new Scanner(System.in);
        System.out.println(" ");
        System.out.print(" Enter the String1 = ");
        String str1 = sc.nextLine();
        System.out.print(" Enter the String2 = ");
        String str2 = sc.nextLine();
        System.out.print(" Enter the String3 = ");
        String str3 = sc.nextLine();
        
        boolean b1 = Boolean.valueOf(str1); 
        boolean b2 = Boolean.valueOf(str2);
        boolean b3 = Boolean.valueOf(str3);

        System.out.println("");
        System.out.println(" The convert String To Boolean Value is : "+b1);
        System.out.println(" The convert String To Boolean Value is : "+b2);
        System.out.println(" The convert String To Boolean Value is : "+b3);
        
        
    }
}