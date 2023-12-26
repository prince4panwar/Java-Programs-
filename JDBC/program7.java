//Create a Scrollable Readonly Resultset and ask the row number from the user and display that row on the screen.
import java.sql.*;
import java.util.Scanner;

class DatabaseManager {
    public static void main(String[] args) throws ClassNotFoundException {
       Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatTest", "root", "");
            System.out.println("Connection successfully");
            Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = st.executeQuery("select * from chats");

            try{
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter row number : ");
                int row = scanner.nextInt();
                result.absolute(row);
                System.out.println("Id = "+result.getInt("id")+ ", username = " + result.getString("username") + ", message = " + result.getString("message"));
                scanner.close();
            } catch(NumberFormatException e){
                System.out.println("Exception: " + e.getMessage());
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}