package by.mycompany.ast.servlets;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    int id;
    String username;
    String password;

    public Test(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Test() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static List<Test> getTest() {
        final String url = "jdbc:mysql://localhost/tododb";
        final String username = "mysql";
        final String password = "mysql";
        List<Test> testList = new ArrayList<>();
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                try {
                    resultSet = statement.executeQuery("select * from user");
                    addToList(testList, resultSet);
                } catch (SQLException e) {
                    System.err.println("Ошибка записи из БД в массив");
                    e.printStackTrace();
                }
            } catch (Exception e) {
                System.err.println("Ошибка подключения к БД");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("Ошибка регистрации драйвера");
            e.printStackTrace();
        }
        return testList;
    }

    public static void addToList(List<Test> testList, ResultSet resultSet) throws SQLException {
        while (Objects.requireNonNull(resultSet).next()) {
            Test test = new Test();
            test.setId(resultSet.getInt("id"));
            test.setUsername(resultSet.getString("username"));
            test.setPassword(resultSet.getString("password"));
            testList.add(test);
        }
    }
}
