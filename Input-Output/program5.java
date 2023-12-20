//Enter the double from user using Scanner class
import java.util.Scanner;

class Double5
{
    public static void main(String args[])
    {
        System.out.println("\nEnter the double from user using Scanner class.\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Double Value : ");
        Double d= sc.nextDouble();
        System.out.println("your entered double value is : "+d);

    }
}