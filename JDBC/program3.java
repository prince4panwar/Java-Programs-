//Insert the row in the table in the database from Java API.
import java.sql.*;

class employee{
public static void main(String s[]){

try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");

Statement s1=con.createStatement();
int x= s1.executeUpdate("insert into users values(8,'test','something@gmail.com')");
if(x==1){
System.out.println("Row inserted successfully");}
}catch(ClassNotFoundException e){System.out.println(e);}
catch(SQLException e){System.out.println(e);}
}}