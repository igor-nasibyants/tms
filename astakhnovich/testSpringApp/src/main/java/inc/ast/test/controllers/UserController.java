package inc.ast.test.controllers;

import inc.ast.test.model.user.User;
import inc.ast.test.repository.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    UserRepo userRepo;

    public UserController (UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public String userList(Model model) {
        Iterable<User> userList = userRepo.findAll();
        model.addAttribute("users", userList);
        return "user/userList";
    }

    @PostMapping("filter")
    public String filterByUsername(@RequestParam String filter, Model model) {
        Iterable <User> users;

        if (filter != null && !filter.isEmpty()) {
            users = userRepo.findByUsername(filter);
        } else {
            users = userRepo.findAll();
        }
        model.addAttribute("users", users);
        return "user/userList";
    }

    @GetMapping("/edit")
    public String userEditForm() {
        return "user/userEdit";
    }

    @PostMapping("/edit/{id}")
    public String userEditForm(@PathVariable String id, Model model) {
        User user = userRepo.findById(id);
            model.addAttribute("user", user);
        return "user/userEdit";
    }
}