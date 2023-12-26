//Create the table in the database from Java API.

class DataDefination {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            java.sql.Connection connect = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    "root", "");

            if (connect.isClosed()) {
                System.out.println(" Your Connection is Closed!");
                System.exit(0);
            }

            // ------------------------------------------------------

            System.out.println(" Your Connection is Establised ");

            java.sql.Statement state = connect.createStatement();

            String create_table_query = "CREATE Table mytable3 (id int)";

            Boolean result = state.execute(create_table_query);

            if (result) {
                System.out.println("Table created!");
            }
            // -----------------------------------------------------

            connect.close();

            if (connect.isClosed())
                System.out.println(" Successfully Connection is Closed!");
        } catch (ClassNotFoundException error) {
            System.out.print(error.getMessage());
        } catch (java.sql.SQLException error) {
            System.out.print(error.getMessage());
        }
    }
}
