//Enter the string from user using BufferedStreamReader
import java.io.*;

class Buffered
{
  public static void main ( String s[] ) throws IOException  //handle the i/o exceptions 
  {
    System.out.print ( "Enter the string: " );

    BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) ); // taking the input

    String inputString = input.readLine();

  

    System.out.println ( "Entered string is: " + inputString );
  }
}