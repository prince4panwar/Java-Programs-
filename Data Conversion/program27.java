// How to convert Hex to Decimal
import java.util.Scanner;

class HexToDecimal 
{
   public static void main(String args[]) 
   { 

      System.out.println("\n How to convert Hex to Decimal.\n");
      Scanner sc=new Scanner(System.in);
      System.out.print(" Enter a Hex Value one  : ");
      String Hex1 = sc.nextLine();

      System.out.print(" Enter a Hex Value two  : ");
      String Hex2 = sc.nextLine();

      int dec1 = Integer.parseInt(Hex1, 16);
      int dec2 = Integer.parseInt(Hex2, 16);

      System.out.println("\n Convert Hex To Decimal value  is : " + dec1);
      System.out.println(" Convert Hex To Decimal value is : " + dec2);
   }
}