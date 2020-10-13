package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static Connection conn;
    public static void main(String[] args)  {
        DbHelper helper = new DbHelper();
        try {
            conn = helper.getConnection();
            System.out.println("Bağlantı kuruldu.");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void showErrorMessage(SQLException exception){ // Exception handler method
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Hata Kodu: " + exception.getErrorCode());
    }
}
