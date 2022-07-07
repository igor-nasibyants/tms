package inc.ast.test.controller;

import inc.ast.test.model.user.Role;
import inc.ast.test.model.user.User;
import inc.ast.test.repository.UserRepo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

import static inc.ast.test.controller.RegistrationController.validationUsername;

@Controller
@PreAuthorize("hasAuthority('ADMIN')")
@RequestMapping("/admin")
public class AdminController {
    UserRepo userRepo;

    public AdminController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public String userList(Model model) {
        Iterable<User> userList = userRepo.findAll();
        model.addAttribute("users", userList);
        return "user/admin/userList";
    }

    @PostMapping("filter")
    public String filterByUsername(@RequestParam String filter,
                                   Model model) {
        List<User> users;

        if (filter != null && !filter.isEmpty()) {
            users = Stream.of(userRepo.findByUsername(filter)).toList() ;
        } else {
            users = userRepo.findAll();
        }
        model.addAttribute("users", users);
        return "user/admin/userList";
    }

    @GetMapping("{id}")
    public String userEditForm(@PathVariable("id") User user,
                               Model model) {
        model.addAttribute("user", user);
        return "user/admin/userEdit";
    }

    @PostMapping("updateUsername/{id}")
    public String updateUsername(@PathVariable Long id,
                                 @RequestParam String username,
                                 Model model) {
        User userFromDB = userRepo.findById(id).get();
        if (validationUsername(username)) {
            userFromDB.setUsername(username);
            userRepo.save(userFromDB);
        } else {
            model.addAttribute("userExists", "User exists!");
        }
        return "redirect:/admin/{id}";
    }

    @PostMapping("updatePassword/{id}")
    public String updatePassword(@PathVariable Long id,
                                 @RequestParam String password) {
        User userFromDB = userRepo.findById(id).get();
        userFromDB.setPassword(password);
        userRepo.save(userFromDB);
        return "redirect:/admin/{id}";
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
        return "redirect:/admin/{id}";
    }

    @GetMapping("deleteUser/{id}")
    public String userEditForm(@PathVariable Long id) {
        userRepo.deleteById(id);
        return "redirect:/";
    }
}
