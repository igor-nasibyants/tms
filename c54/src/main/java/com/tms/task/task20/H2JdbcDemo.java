package com.tms.task.task20;

import java.sql.*;

public class H2JdbcDemo {
    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "";
    static final String PASS = "";
    static final String QUERY_CREATE = "create table Employees(\n" +
            "    id INT NOT NULL AUTO_INCREMENT,\n" +
            "    first_name VARCHAR(50),\n" +
            "    last_name VARCHAR(50),\n" +
            "    age INT NOT NULL,\n" +
            "    primary key (id)\n" +
            ");";
    static final String QUERY_INSERT = "insert into Employees values (1, 'asdfd', 'asdh', 42)";
    static final String QUERY = "SELECT id, first_name, last_name, age FROM Employees";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()
        ) {
            stmt.execute(QUERY_CREATE);
            stmt.execute(QUERY_INSERT);
            ResultSet rs = stmt.executeQuery(QUERY);
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
