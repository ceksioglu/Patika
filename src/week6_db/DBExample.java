package week6_db;

import java.sql.*;

public class DBExample {
    // Database URL
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    // Database username
    public static final String DB_USERNAME = "postgres";
    // Database password
    public static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        String query = "SELECT * FROM student";

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("DB connection established.");

            // Example for executing a select query and printing the results

            st = connect.createStatement();
            ResultSet data = st.executeQuery(query);
            while (data.next()) {
                System.out.println("ID: " + data.getInt("student_id"));
                System.out.println("Student Name: " + data.getString("student_name"));
                System.out.println("Student Class: " + data.getInt("student_class"));
                System.out.println("-----------------------------------------------");
            }
            data.close();

        } catch (SQLException e) {
            System.out.println("Operation failed: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found: " + e.getMessage());
        }
    }
}
