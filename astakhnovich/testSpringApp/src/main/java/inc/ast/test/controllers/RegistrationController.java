package inc.ast.test.controllers;

import inc.ast.test.model.user.Role;
import inc.ast.test.model.user.User;
import inc.ast.test.repository.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private UserRepo userRepo;

    public RegistrationController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public String registration() {
        return "/security/registration";
    }

    @PostMapping
    public String addUser(@RequestParam(name="username") String username, @RequestParam(name="password") String password,
                          Model model) {
        User newUser = new User(username, password, true, Role.USER);
        Iterable<User> userFromDb = userRepo.findByUsername(newUser.getUsername());

        if (newUser.equals(userFromDb)) {
            model.addAttribute("message", "User exists!");
            return "/security/registration";
        }

        userRepo.save(newUser);
        return "redirect:/login";
    }
}