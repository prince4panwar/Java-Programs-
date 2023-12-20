//Enter the long integer from user using Scanner class
class Long8
{

    public static void main(String[] args) 
    {
        System.out.println("\nEnter the long integer from user using Scanner class.\n");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a Long Interger value : ");
        long num = sc.nextLong();
        System.out.println("your entered long integer value is  : "+num);
    }
}
