package com.tms.task.task20;

import java.sql.*;

public class JdbcDemo {

    static final String DB_URL = "jdbc:mysql://localhost:3306/TUTORIALSPOINT";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT id, first_name, last_name, age FROM Employees";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first_name"));
                System.out.println(", Last: " + rs.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
