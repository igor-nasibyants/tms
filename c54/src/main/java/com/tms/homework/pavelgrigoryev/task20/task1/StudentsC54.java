package com.tms.homework.pavelgrigoryev.task20.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentsC54 {
    static final String url = "jdbc:mysql://localhost/studentsc54";
    static final String username = "root";
    static final String password = "мой пароль";

    public static void main(String[] args) {
        tableCreation();
        addToTable();
        printTable();
    }

    public static void tableCreation() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                statement.executeUpdate("create table studentsc54 (id int primary key auto_increment, studentsname varchar(20)," +
                        " studentssurname varchar(20))");
                System.out.println("Табличка создана!");
            }
        } catch (Exception ex) {
            System.err.println("Не получилось, не срослось :(");
            System.err.println(ex);
        }
    }

    public static void addToTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                int add = statement.executeUpdate("insert studentsc54 (studentsname, studentssurname)" +
                        " values ('Artsiom', 'Vladykouski'), ('Asilius', 'One'), ('Nikita', 'Astakhovich')," +
                        "('Nikita', 'Han'), ('Nikita', 'Elenski'), ('Nnazarv', 'Task1'), ('Pavel', 'Grigoryev'), " +
                        "('Matvei', 'Shumchenia'), ('Sergey', 'Staryyo')");
                System.out.println("Количество добавленных : " + add);
            }

        } catch (Exception ex) {
            System.err.println("Не получилось, не срослось :(");
            System.err.println(ex);
        }
    }

    public static void printTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from studentsc54");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String studentsName = resultSet.getString(2);
                    String studentsSurname = resultSet.getString(3);
                    System.out.printf("%d. %s - %s \n", id, studentsName, studentsSurname);
                }
            }

        } catch (Exception ex) {
            System.err.println("Не получилось, не срослось :(");
            System.err.println(ex);
        }
    }
}
