// Program to insert, delete, update in table using PreparedStatement.
import java.sql.*;
import java.util.Scanner;

class Database{
    Connection c;
    PreparedStatement s;
    public Database(String url,String uname,String pass) throws SQLException,ClassNotFoundException{
    Class.forName("com.mysql.cj.jdbc.Driver");
         c=DriverManager.getConnection(url,uname,pass);
    }
     void insert() throws SQLException {
    s=c.prepareStatement("insert into users values(?,?,?)");
    s.setInt(1,13);
    s.setString(2,"Ankush");
    s.setString(3,"Ankush@gmail.com");
System.out.println(s.executeUpdate() +"Row affected");
   }
     void delete() throws SQLException {
        s=c.prepareStatement("delete from users where id=?");
        s.setInt(1,8);
System.out.println(s.executeUpdate() +"Row affected");
        }

     void update() throws SQLException {
       s=c.prepareStatement("update users set username=? where id=?");
       s.setString(1,"Srk");
       s.setInt(2,1);
       System.out.println(s.executeUpdate() +"Row affected");
        }
}
class Db{
    public static void main(String str [])throws SQLException,ClassNotFoundException,java.io.IOException{
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "";
        Database d=new Database(url,username,password);
        int c = 5;
        Scanner sc=new Scanner(System.in);
        while(c!=4){
            System.out.println(" Press 1 for insert. \n Press 2 for delete \n Press 3 for update \n Press 4 for Exit");
            c=sc.nextInt();
            switch(c){
              case 1:
              d.insert();
              break;
              
              case 2:
              d.delete();
              break;
              
              case 3:
              d.update();
              break;
              case 4:
              System.out.println("Exit Successfully");
              break;
              default :
              System.out.println("Choose between 1-4");
              break;
            }
        }
    }
}
