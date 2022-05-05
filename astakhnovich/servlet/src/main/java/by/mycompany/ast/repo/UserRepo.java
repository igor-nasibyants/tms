package by.mycompany.ast.repo;

import by.mycompany.ast.entity.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/site";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static boolean insert(User user) {
        List<User> userList = select();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
                try (final PreparedStatement statement =
                             connection.prepareStatement("insert users(id, login, password) value(?, ?, ?)")) {
                    int id = userList.size() == 0 ? 1 : userList.size() + 1;
                    statement.setInt(1, id);
                    statement.setString(2, user.getLogin());
                    statement.setString(3, user.getPassword());
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
                    int id = resultSet.getInt(1);
                    String login = resultSet.getString(2);
                    String password = resultSet.getString(3);
                    User user = new User(id, login, password);
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
