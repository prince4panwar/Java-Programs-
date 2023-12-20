//Get all characters from the file, count number of lines, words, characters and display on the screen
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class countFile
{
public static void main(String args[])
{
String filePath = "file.txt";

try
{
File f=new File(filePath);
Scanner sc = new Scanner(f);
int lineCount = 0;
int wordCount = 0;
int charCount = 0; 
while(sc.hasNextLine())
{
String line = sc.nextLine();
lineCount++;
charCount +=line.length();
String[] words =line.split(" ");
wordCount +=words.length;
}
System.out.println("\nGet All Characters from the file, Count the number of line, words, characters and display on the screen"); 

System.out.println("\nfile.txt : \nHello,\nGood Morning\nHow are you\n");
System.out.println("Number of Lines : "+lineCount); 
System.out.println("Number of Words : "+wordCount); 
System.out.println("Number of characters : "+charCount); 
}

catch(FileNotFoundException e)
{
System.out.println("File not found : "+e.getMessage());
}

}
}