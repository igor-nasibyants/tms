package com.tms.task.task20;

import java.sql.*;

public class PreparedStatementDemo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/TUTORIALSPOINT";

    static final String USER = "root";
    static final String PASSWORD = "root";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        System.out.println("Registering JDBC driver...");
        Class.forName(JDBC_DRIVER);

        System.out.println("Creating connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);


        try {
            String SQL = "SELECT * FROM developers";
            preparedStatement = connection.prepareStatement(SQL);
            System.out.println("Initial developers table content:");
            ResultSet resultSet = preparedStatement.executeQuery(SQL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialty = resultSet.getString("specialty");
                int salary = resultSet.getInt("salary");

                System.out.println("id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Specialty: " + specialty);
                System.out.println("Salary: " + salary);
                System.out.println("\n============================\n");
            }

            SQL = "Update developers SET salary=? WHERE specialty=?";
            System.out.println("Creating statement...");
            System.out.println("Executing SQL query...");

            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, 3000);
            preparedStatement.setString(2, "Dev");

            System.out.println("Rows impacted: " + preparedStatement.executeUpdate());

            System.out.println("Final developers table content:");
            SQL = "SELECT * FROM developers";
            resultSet = preparedStatement.executeQuery(SQL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialty = resultSet.getString("specialty");
                int salary = resultSet.getInt("salary");

                System.out.println("id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Specialty: " + specialty);
                System.out.println("Salary: " + salary);
                System.out.println("\n============================\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        System.out.println("Thank You.");
    }
}
