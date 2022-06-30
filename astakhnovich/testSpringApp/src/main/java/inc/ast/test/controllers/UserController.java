package inc.ast.test.controllers;

import inc.ast.test.entitys.user.User;
import inc.ast.test.repos.UserRepo;
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

    @GetMapping("/list")
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

    @GetMapping("/edit/{user}")
    public String userEditForm(@PathVariable User user, Model model) {
        model.addAttribute("user", user);
        return "user/userEdit";
    }
}
