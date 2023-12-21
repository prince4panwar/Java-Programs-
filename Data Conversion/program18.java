//How to convert double to int
import java.util.Scanner;

class DoubleToInt
{
    public static void main(String args[])
    {
      System.out.println("\n How to Convert Double To Int.\n");
      System.out.print(" Enter a double value one  : ");
      Scanner sc=new Scanner(System.in);
      double num1 = sc.nextDouble();
      System.out.print(" Enter a double value Two : ");
      double num2 = sc.nextDouble();

      int value1 =(int)num1;
      int value2=(int)num2;

      System.out.println("\n Convert Double value To Integer value is  : "+value1);
      System.out.println(" Convert Double value To Integer value is  : "+value2);
    }
}