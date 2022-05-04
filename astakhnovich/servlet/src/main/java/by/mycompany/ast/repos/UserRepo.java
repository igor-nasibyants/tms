package by.mycompany.ast.repos;

import by.mycompany.ast.entity.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;

public class UserRepo {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/site";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static boolean insert(User user) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
                try (final PreparedStatement statement =
                             connection.prepareStatement("insert users(login, password) value(?, ?)")) {
                    statement.setString(1, user.getLogin());
                    statement.setString(2, user.getPassword());
                    statement.executeUpdate();
                    return true;
                }
            }
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }

    public static ArrayList<User> select() {
        ArrayList<User> users = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

                while(resultSet.next()){
                    String login = resultSet.getString(1);
                    String password = resultSet.getString(2);
                    User user = new User(login, password);
                    users.add(user);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return users;
    }
}
