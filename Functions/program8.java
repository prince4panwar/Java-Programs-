//Java method to display the current date and time.
import java.util.Date;
class Test
{
    static void apnaTimeAgya(Boolean check)
    {
        if (check)
        {
            Date d = new Date();

            System.out.println(" hero time "+d);
        }
        else
        {
            System.out.println("ja me nahi btata");
        }
    }
    public static void main(String args[])
    {
        Test t = new Test();
        
        t.apnaTimeAgya(false);
        t.apnaTimeAgya(true);
    }
}