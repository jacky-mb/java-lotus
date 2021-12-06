package Helpers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class Database {
    public static class MYSQL {

        public static void main(String args[]) {
            try {
                // connnect to database 'testdb'
                String DB_URL = "jdbc:mysql://127.0.0.1:3306/admin";
                String USER_NAME = "admin";
                String PASSWORD = "admin";
                Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//                 crate statement
                Statement stmt = conn.createStatement();
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery("select * from user");
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3));
                }
//                 close connection
                conn.close();
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
