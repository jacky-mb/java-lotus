package Helpers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class Database {
    public static class MYSQL {
        String DB_URL = "jdbc:mysql://127.0.0.1:3306/admin";
        String USER_NAME = "admin";
        String PASSWORD = "admin";
        private Connection connect;
        MYSQL() throws SQLException {
            try {
                connect = getConnection(DB_URL, USER_NAME, PASSWORD);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Properties props = new Properties();
        System.out.print(props.getProperty("oracle.dbname"));
    }
}
