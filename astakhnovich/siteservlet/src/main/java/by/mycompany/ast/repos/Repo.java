//package by.mycompany.ast.repos;
//
//import by.mycompany.ast.entitys.User;
//
//import java.sql.*;
//import java.util.ArrayList;
//
//public class Repo {
//    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/site";
//    private static final String USER = "root";
//    private static final String PASS = "root";
//
//    public static ArrayList<User> select() {
//        ArrayList<User> users = new ArrayList<>();
//        try{
//            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
//
//                Statement statement = conn.createStatement();
//                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//
//                while(resultSet.next()){
//                    int id = resultSet.getInt(1);
//                    String name = resultSet.getString(2);
//                    String login = resultSet.getString(3);
//                    String password = resultSet.getString(4);
//
//                    User user = new User(id, name, login, password);
//                    users.add(user);
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return users;
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
//
//    public static int insert(User user) {
//        try{
//            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
//                try(PreparedStatement preparedStatement =
//                            conn.prepareStatement("INSERT INTO users (name, login, password) Values (?, ?, ?)")){
//                    preparedStatement.setString(1, user.getName());
//                    preparedStatement.setString(2, user.getLogin());
//                    preparedStatement.setString(3, user.getPassword());
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
//}