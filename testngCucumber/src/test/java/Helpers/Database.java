package Helpers;

import java.util.Properties;

public class Database {
    Database(){
//        Properties props = new Properties();
//        System.out.println(props.getProperty("oracle.url"));
    }

    public static void main(String[] args) {
        Properties props = new Properties();
        System.out.println(props.getProperty("oracle.dbname"));
    }
}
