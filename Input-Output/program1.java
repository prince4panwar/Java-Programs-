//Enter the character from user using InputStreamReader

import java.io.*;  
 class InputStreamReaderP{  
public static void main(String args[])throws Exception{  
  
InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);  
  
System.out.println("Enter your name");  
String name=br.readLine();  
System.out.println("Welcome "+name);  
 }  
}  