package com.tms.homework.staryyo;

import java.sql.*;

public class Main {

    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "sa";
    static final String PASS = "";
    static final String QUERY = "SELECT id, first_name, last_name, age FROM EMPLOYEES";
    static final String QUERY_INSERT = "insert into EMPLOYEES values (1, 'asdfasdf', 'asdfasdf', 42)";
    static final String QUERY_CREATE = "create table EMPLOYEES(\n" +
            "    id INT NOT NULL AUTO_INCREMENT,\n" +
            "    first_name VARCHAR(50),\n" +
            "    last_name VARCHAR(50),\n" +
            "    age INT NOT NULL,\n" +
            "    primary key (id)\n" +
            ")";

    public static void main(String[] args) {

        // Open a connection
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:h2:/Users/mac/test",
                    "sa", "");

            Statement stmt = conn.createStatement();
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
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}