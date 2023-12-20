//Get all characters from the file and display on the screen
import java.util.Scanner;
import java.io.*;

class test
{
    public static void main(String[] args)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        // enter filename along with its extension
        System.out.print("Enter the Name of File: ");
        fname = scan.nextLine();
        
        String line = null;
        try
        {
            FileReader fileReader = new FileReader(fname);
            
            // always wrap the FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
            // always close the file after its use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
    }
}