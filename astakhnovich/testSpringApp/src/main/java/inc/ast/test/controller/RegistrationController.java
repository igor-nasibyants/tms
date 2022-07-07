package inc.ast.test.controller;

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
    private static UserRepo userRepo;

    public RegistrationController(UserRepo userRepo, UserRepo userServiceRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public String registration() {
        return "/security/registration";
    }

    @PostMapping
    public String addUser(@RequestParam(name="username") String username,
                          @RequestParam(name="password") String password,
                          Model model) {

        if (validationUsername(username)) {
            User newUser = new User(username, password, true, Role.USER);
            userRepo.save(newUser);
            return "redirect:/login";
        }else {
            model.addAttribute("userExists", "User exists!");
            return "/security/registration";
        }
    }

    public static boolean validationUsername(String username){
        User user = userRepo.findByUsername(username);
        return user == null;
    }

    public static boolean validationPassword(String username){
        User user = userRepo.findByUsername(username);
        if(true){
            return user == null;
        }else {
            return user == null;
        }
    }
}