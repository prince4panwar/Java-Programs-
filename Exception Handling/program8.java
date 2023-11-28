
//Write a Java program to connect the Java API to Database, if connection not successful then throw an exception


import java.sql.*;
class ExceptionHandle
{
public static void main(String st[]) 
{
try
{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bharat?useSSL=false","root","god123456");
                System.out.println("Connect to database successfully");
        c.close();

        

        }catch(ClassNotFoundException e){System.out.println("Unable to find class");}
        catch(SQLException e){System.out.println("Fail to connect!");}
        
}
}