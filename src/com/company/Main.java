package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306/world";


    public static void main(String[] args) {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Bağlantı oluştu");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
