package week6_db;

import java.sql.*;

/**
 * DBConnect is a utility class for executing various database queries.
 * It connects to the PostgreSQL database and performs SELECT, INSERT, UPDATE, and DELETE operations.
 */
public class DBConnect {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "root";

    /**
     * Main method to establish a database connection and execute queries.
     * This method demonstrates how to load the PostgreSQL driver, establish a connection,
     * and execute SQL queries using both Statement and PreparedStatement.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        // Create SQL query (EDIT ACCORDING TO NEED):
        // Query to select all students
        // String query = "SELECT * FROM student";

        // Prepared query to insert a student
        // String preparedQuery = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";

        // Statement query to update a student's name
        // String stUpdateQuery = "UPDATE student SET student_name='Mahmut Hoca' WHERE student_id=4";

        // Prepared query to update a student's name
        // String prUpdateQuery = "UPDATE student SET student_name=? WHERE student_id=?";

        // Statement query to delete a student
        // String stDeleteQuery = "DELETE FROM student WHERE student_id=4";

        // Prepared query to delete a student
        // String prDeleteQuery = "DELETE FROM student WHERE student_id=?";

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("DB connection established.");

            // Example for creating a statement and executing an update
            /*
            st = connect.createStatement();
            int rowsAffected = st.executeUpdate(stUpdateQuery);
            System.out.println("Rows updated: " + rowsAffected);
            */

            // Example for creating a prepared statement to update data
            /*
            PreparedStatement prst = connect.prepareStatement(prUpdateQuery);
            prst.setString(1, "Ahmet Hoca");
            prst.setInt(2, 4);
            int prRowsAffected = prst.executeUpdate();
            System.out.println("Rows updated: " + prRowsAffected);
            prst.close();
            */

            // Example for executing a select query and printing the results
            /*
            ResultSet data = st.executeQuery(query);
            while (data.next()) {
                System.out.println("ID: " + data.getInt("student_id"));
                System.out.println("Student Name: " + data.getString("student_name"));
                System.out.println("Student Class: " + data.getInt("student_class"));
                System.out.println("-----------------------------------------------");
            }
            data.close();
            */

        } catch (SQLException e) {
            System.out.println("Operation failed: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found: " + e.getMessage());
        } finally {
            closeResources(connect, st);
        }
    }

    /**
     * Closes the database connection and statement resources.
     * This method ensures that the Connection and Statement objects are properly closed
     * to prevent resource leaks.
     *
     * @param connect The database connection to close
     * @param st The statement to close
     */
    private static void closeResources(Connection connect, Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                System.out.println("Failed to close Statement: " + e.getMessage());
            }
        }
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException e) {
                System.out.println("Failed to close connection: " + e.getMessage());
            }
        }
    }
}
