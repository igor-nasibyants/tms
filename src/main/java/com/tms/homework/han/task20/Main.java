package com.tms.homework.han.task20;

import java.sql.*;
import java.util.Objects;

public class Main {
    private static final String url = "jdbc:mysql://localhost/myfirstdb";
    private static final String username = "mysql";
    private static final String password = "mysql";

    public static void main(String[] args) {
        operationsOnTable();
        printTable();
    }

    public static void operationsOnTable() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();

//            int add = statement.executeUpdate("insert student(name, age, homework)" +
//                    " value('Sergey', 30, 15)");
//
//            int update = statement.executeUpdate("update student set id = 9" +
//                    " where name = 'Sergey' and id = '11'");
//
//            int delete = statement.executeUpdate("delete from student " +
//                    "where id != 8 and name = 'Artem'");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void printTable() {
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            try {
                resultSet = statement.executeQuery("select * from student");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            while (Objects.requireNonNull(resultSet).next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setHomework(resultSet.getInt("homework"));
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
