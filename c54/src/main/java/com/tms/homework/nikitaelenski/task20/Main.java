package com.tms.homework.nikitaelenski.task20;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String url = "jdbc:mysql://localhost:3306/mydb";
        final String user = "root";
        final String pass = "nikitaHDHD333451376";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(url,user,pass);
        Statement statement = conn.createStatement()) {
            statement.executeUpdate("drop table books");
            statement.executeUpdate("create table Books (id MEDIUMINT not null auto_increment,name VARBINARY(30) not null , PRIMARY KEY (id), stroka VARBINARY(30));");
            for(int x = 0 ; x<10 ; x++) {
                statement.executeUpdate("INSERT books(name , stroka) VALUES ('Solomon key' , 'moya')");
            }
            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print( resultSet.getString(2) + " ");
                System.out.print( resultSet.getString(3));
                System.out.println("");
            }
        }


    }
}
