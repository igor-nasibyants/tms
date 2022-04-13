package com.tms.homework.pavelgrigoryev.task20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddUpdateDeleteObjectsInTables {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/store";
            String username = "root";
            String password = "ваш пароль";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();

               /*добавление в таблицу
               int add = statement.executeUpdate("insert products(productname, price) values ('iPhone X', 76000)," +
                       "('Galaxy S9', 45000), ('Nokia 9', 36000)");
               System.out.println( "Added : " + add);*/

                /*изменение в таблице
                int update = statement.executeUpdate("update products set price = price - 5000");
                System.out.println("Updated : " + update);*/

                //удаление из таблицы
                int delete = statement.executeUpdate("delete from products where id = 6");
                System.out.println("Deleted : " + delete);
            }
        } catch (Exception e) {
            System.out.println("Connection failed...");
            System.out.println(e);
        }
    }
}
