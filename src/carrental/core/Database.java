package carrental.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/carrental",
                    "postgres",
                    "root"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}