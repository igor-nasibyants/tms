package by.mycompany.ast.model;

import by.mycompany.ast.entitys.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Model {
    private static Model instance = new Model();
    private Map<String, User> model;

    private Model() {
        model = new HashMap<>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(User user) {
        model.put(user.getLogin(), user);
    }

    public boolean getIsUser(String login, String password){
        User isUser = model.get(login);
        return isUser.getPassword().equals(password);
    }

    public List<String> list() {
        return model.values().stream()
                .map(User::toString)
                .collect(Collectors.toList());
    }
}
