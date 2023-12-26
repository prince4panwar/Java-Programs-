//  Delete the row in the table in the database from Java API.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

class Main {
    private static Connection con;
    private static int rows_affected;

    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            
            Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
            String sql = "DELETE FROM students";
            
            rows_affected = st.executeUpdate(sql);
            System.out.println("Numbers of rows deleted : "+rows_affected);
            
            //telling user that he is deleting from an empty table.
            ResultSet rs =  st.executeQuery("SELECT * FROM students");
            if(!rs.next())
            System.out.println("--------   Hey User, Your table is empty.  --------");
        }
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
        catch(SQLException s)
        {
            s.printStackTrace();
        }

        if(con!=null) {
            try {
                con.close();
            }
            catch(SQLException sql_e) {
                sql_e.printStackTrace();
            }
        }
    }
}