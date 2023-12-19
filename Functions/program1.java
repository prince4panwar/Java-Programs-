//Java method to find the smallest number among three numbers.

import java.util.Scanner;
class CheckSmallestNumber
{
    public static void main(String arg[])
    {
        smallestNumber();
    }
    public static void smallestNumber()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a first number :- ");
        int a = s.nextInt();
        System.out.print("\nEnter a second number :- ");
        int b = s.nextInt();
        System.out.print("\nEnter a thrid number :- ");
        int c = s.nextInt();

        if(a<b&&a<c)
        {
            System.out.println(a+" is smallest number");
        }
        else if(b<a&&b<c)
        {
            System.out.println(b+" is smallest number");
        }
        else
        {
            System.out.println(c+"is smallest number");
        }
    }
}