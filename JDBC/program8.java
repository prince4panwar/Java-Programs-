//Create a Scrollable Updateable Resultset and insert a new row, update an existing row and delete the row from Resultset and also the changes should be made to the database also. The values should be inserted, updated and deleted by the user only.
import java.sql.*;
import java.util.Scanner;

class ScrollableResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/chatTest";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // Create a ResultSet that is scrollable and updatable
            ResultSet resultSet = statement.executeQuery("SELECT * FROM chats");

            System.out.println("All rows before operations :");
            while (resultSet.next()) {
                System.out.println("Id = " + resultSet.getInt("id") + ", username = " + resultSet.getString("username") + ", message = " + resultSet.getString("message"));
            }

            Scanner scanner = new Scanner(System.in);

            // Insert a new row
            System.out.println("Enter values for new row:");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Username: ");
            String usernameValue = scanner.nextLine();
            System.out.print("Message: ");
            String message = scanner.nextLine();

            resultSet.moveToInsertRow();
            resultSet.updateInt("id", id);
            resultSet.updateString("username", usernameValue);
            resultSet.updateString("message", message);
            resultSet.insertRow();

            // Update an existing row
            System.out.println("Enter values for row to update:");
            System.out.print("Id: ");
            int updateId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("New message: ");
            String newMessage = scanner.nextLine();

            resultSet.beforeFirst();
            while (resultSet.next()) {
                if (resultSet.getInt("id") == updateId) {
                    resultSet.updateString("message", newMessage);
                    resultSet.updateRow();
                    break;
                }
            }

            // Delete a row
            System.out.println("Enter id of row to delete:");
            int deleteId = scanner.nextInt();
            scanner.nextLine();

            resultSet.beforeFirst();
            while (resultSet.next()) {
                if (resultSet.getInt("id") == deleteId) {
                    resultSet.deleteRow();
                    break;
                }
            }

            scanner.close();

            System.out.println("All rows after operations :");
            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println("Id = " + resultSet.getInt("id") + ", username = " + resultSet.getString("username") + ", message = " + resultSet.getString("message"));
            }

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}