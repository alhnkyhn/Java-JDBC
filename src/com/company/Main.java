package com.company;

import java.sql.*;

public class Main {
    static Connection conn;
    public static void main(String[] args)  {
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            conn = helper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select Name from city limit 1000");

            while (resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void showErrorMessage(SQLException exception){ // Exception handler method
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Hata Kodu: " + exception.getErrorCode());
    }
}
