//Enter the boolean from user using Scanner class


class Boolean6 
{

    public static void main(String[] args) 
    {
        System.out.println("\nEnter the boolean from user using Scanner class.\n");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a boolean value (true or false): ");
        Boolean b = sc.nextBoolean();
        System.out.println(b);
        
    }
}
