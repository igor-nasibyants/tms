package by.mycompany.ast.repo;

import by.mycompany.ast.entity.Role;
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
                             connection.prepareStatement("insert users(id, login, password, role) value(?, ?, ?, ?)")) {
                    int id = userList.size() == 0 ? 1 : userList.size() + 1;
                    statement.setInt(1, id);
                    statement.setString(2, user.getLogin());
                    statement.setString(3, user.getPassword());
                    statement.setObject(4, "USER");
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
                    Role role =  Role.getRoleByString(resultSet.getString(4));
                    User user = new User(id, login, password, role);
                    users.add(user);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return users;
    }

    //    public static int delete(int id) {
//        try{
//            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
//                try(PreparedStatement preparedStatement =
//                            conn.prepareStatement("DELETE FROM products WHERE id = ?")){
//                    preparedStatement.setInt(1, id);
//                    return  preparedStatement.executeUpdate();
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return 0;
//    }

    //    public static int update(User user) {
//        try{
//            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
//                try(PreparedStatement preparedStatement =
//                            conn.prepareStatement("UPDATE products SET name = ?, login = ?, password = ? WHERE id = ?")){
//                    preparedStatement.setString(1, user.getName());
//                    preparedStatement.setString(2, user.getLogin());
//                    preparedStatement.setString(3, user.getPassword());
//                    preparedStatement.setInt(4, user.getId());
//                    return  preparedStatement.executeUpdate();
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return 0;
//    }
//


//    public static User selectOne(int id) {
//
//        User user = new User(0,"null", "null", "null");
//        try{
//            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
//                try(PreparedStatement preparedStatement =
//                            conn.prepareStatement("SELECT * FROM users WHERE id=?")){
//                    preparedStatement.setInt(1, id);
//                    ResultSet resultSet = preparedStatement.executeQuery();
//                    if(resultSet.next()){
//
//                        int userId = resultSet.getInt(1);
//                        String name = resultSet.getString(2);
//                        String login = resultSet.getString(3);
//                        String password = resultSet.getString(4);
//
//                        user = new User(userId, name, login, password);
//                    }
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return user;
//    }
}
