package Helpers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class Database {
    public static class SQLDB {
        private static final String DB_URL = "jdbc:mysql://localhost:3306/admin";
        private static final String USER_NAME = "admin";
        private static final String PASSWORD = "admin";
        private static Connection connection = null;

        public Connection getConn(){
            return connection;
        }
        SQLDB() {
            try {
                connection = getConnection(DB_URL, USER_NAME, PASSWORD);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        SQLDB(String endPoint, String user, String password) {
            try {
                connection = getConnection(endPoint, user, password);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }



        public ResultSet executeQuery(String sql) throws SQLException {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(sql);
        }
    }

    public static void main(String[] args) throws SQLException {
        SQLDB db = new SQLDB();
        System.out.println(db.executeQuery("select * from demo"));
//        System.out.println(db.getConn().getMetaData());
    }
}
