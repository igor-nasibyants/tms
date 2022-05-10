package by.mycompany.ast.repo;

import by.mycompany.ast.entity.Role;
import by.mycompany.ast.entity.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/site";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static boolean insert(User user) {
        if(UserRepo.selectOne(user.getLogin()).getLogin().equals(user.getLogin())){
            return false;
        }else{
            List<User> userList = select();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
                    try (PreparedStatement statement =
                                 connection.prepareStatement("insert users( name, login, password, role)" +
                                         " value( ?, ?, ?, ?)")) {
//                        int id = userList.size() == 0 ? 1 : userList.size() + 1;
//                        statement.setInt(1, id);
                        statement.setString(1, user.getName());
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
    }

    public static ArrayList<User> select() {
        ArrayList<User> users = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

                while(resultSet.next()){
                    int idFromDB = resultSet.getInt(1);
                    String nameFromDB = resultSet.getString(2);
                    String loginFromDB = resultSet.getString(3);
                    String passwordFromDB = resultSet.getString(4);
                    Role roleFromDB =  Role.getRoleByString(resultSet.getString(5));
                    User user = new User(idFromDB, nameFromDB, loginFromDB, passwordFromDB, roleFromDB);
                    users.add(user);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return users;
    }

    public static User selectOne(String login){
        User user = new User(0,"null", "null", "null", Role.USER);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
                try(PreparedStatement preparedStatement =
                            conn.prepareStatement("SELECT * FROM users WHERE login=?")){
                    preparedStatement.setString(1, login);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    if(resultSet.next()){
                        int IdFromDB = resultSet.getInt(1);
                        String nameFromDB = resultSet.getString(2);
                        String loginFromDB = resultSet.getString(3);
                        String passwordFromDB = resultSet.getString(4);
                        Role roleFromDB =  Role.getRoleByString(resultSet.getString(5));

                        user = new User(IdFromDB,nameFromDB, loginFromDB, passwordFromDB, roleFromDB);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return user;
    }

    public static boolean update(User user) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
                try(PreparedStatement preparedStatement =
                            conn.prepareStatement("UPDATE users SET name = ?, login = ?, password = ? WHERE id = ?")){
                    preparedStatement.setString(1, user.getName());
                    preparedStatement.setString(2, user.getLogin());
                    preparedStatement.setString(3, user.getPassword());
                    preparedStatement.setInt(4, user.getId());
                    preparedStatement.executeUpdate();
                    return true;
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }

    public static boolean delete(int id) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
                try(PreparedStatement preparedStatement =
                            conn.prepareStatement("DELETE FROM users WHERE id = ?")){
                    preparedStatement.setInt(1, id);
                    preparedStatement.executeUpdate();
                    return true;
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }

    }
}