package week6_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The DBTransaction class demonstrates how to perform database transactions
 * using JDBC with PostgreSQL. This example shows how to insert records into
 * a table with transaction management, including commit and rollback.
 *
 * Database connection details:
 * URL: jdbc:postgresql://localhost:5432/university
 * Username: postgres
 * Password: root
 */
public class DBTransaction {
    // Database URL
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    // Database username
    public static final String DB_USERNAME = "postgres";
    // Database password
    public static final String DB_PASSWORD = "root";

    /**
     * The main method establishes a connection to the database, inserts records
     * into the student table, and manages transactions with commit and rollback.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        Connection connection = null;
        try {
            // Establish the database connection
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            // Disable auto-commit mode
            connection.setAutoCommit(false);

            // Prepare the SQL statement for inserting records
            PreparedStatement prst = connection.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?,?)");
            // Set the first student's details
            prst.setString(1, "Tatsuki Kayaname");
            prst.setInt(2, 5);
            // Execute the insert operation
            prst.executeUpdate();

            // Set the second student's details
            prst.setString(1, "Deniz Ural");
            prst.setInt(2, 4);
            // Execute the insert operation
            prst.executeUpdate();

            // Commit the transaction
            connection.commit();
        } catch (SQLException e) {
            // Handle SQL exceptions
            if (connection != null) {
                try {
                    // Rollback the transaction in case of an error
                    connection.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } finally {
            // Close the database connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
