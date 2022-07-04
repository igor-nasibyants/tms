package inc.ast.test.controller;

import inc.ast.test.model.user.Role;
import inc.ast.test.model.user.User;
import inc.ast.test.repository.UserRepo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static inc.ast.test.controller.RegistrationController.validationUsername;

@Controller
@RequestMapping("/user")
@PreAuthorize("hasAuthority('ADMIN')")
public class UserController {
    UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public String userList(Model model) {
        Iterable<User> userList = userRepo.findAll();
        model.addAttribute("users", userList);
        return "user/userList";
    }

    @PostMapping("filter")
    public String filterByUsername(@RequestParam String filter,
                                   Model model) {
        Iterable<User> users;

        if (filter != null && !filter.isEmpty()) {
            users = userRepo.findByUsername(filter);
        } else {
            users = userRepo.findAll();
        }
        model.addAttribute("users", users);
        return "user/userList";
    }

    @GetMapping("{id}")
    public String userEditForm(@PathVariable("id") User user,
                               Model model) {
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @PostMapping("updateUsername/{id}")
    public String updateUsername(@PathVariable Long id,
                                 @RequestParam String username,
                                 Model model) {
        User userFromDB = userRepo.findById(id).get();
        if (validationUsername(username)) {
            userFromDB.setUsername(username);
            userRepo.save(userFromDB);
            return "redirect:/user";
        } else {
            model.addAttribute("userExists", "User exists!");
            return "redirect:/user/{id}";
        }
    }

    @PostMapping("updatePassword/{id}")
    public String updatePassword(@PathVariable Long id,
                                 @RequestParam String password) {
        User userFromDB = userRepo.findById(id).get();
        userFromDB.setPassword(password);
        userRepo.save(userFromDB);
        return "redirect:/user";
    }

    @PostMapping("updateRole/{id}")
    public String updateRole(@PathVariable Long id,
                             @RequestParam String role) {
        User userFromDB = userRepo.findById(id).get();
        switch (role) {
            case "USER" -> userFromDB.setRole(Role.USER);
            case "PROVIDER" -> userFromDB.setRole(Role.PROVIDER);
            case "ADMIN" -> userFromDB.setRole(Role.ADMIN);
        }
        userRepo.save(userFromDB);
        return "redirect:/user";
    }

    @GetMapping("deleteUser/{id}")
    public String userEditForm(@PathVariable Long id) {
        userRepo.deleteById(id);
        return "redirect:/";
    }
}
