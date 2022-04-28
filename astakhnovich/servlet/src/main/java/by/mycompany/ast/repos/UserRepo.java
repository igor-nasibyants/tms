package by.mycompany.ast.repos;

import by.mycompany.ast.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

    public static void addUserToList(User user){
        userList.add(user);
    }
}
