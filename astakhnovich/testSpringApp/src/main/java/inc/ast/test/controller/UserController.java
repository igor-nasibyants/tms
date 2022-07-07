package inc.ast.test.controller;

import inc.ast.test.model.user.User;
import inc.ast.test.repository.UserRepo;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import static inc.ast.test.controller.RegistrationController.validationUsername;

@Controller
@RequestMapping("/user")
public class UserController {
    UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/settings")
    public String userSettings(Model model) {
        User userFromSession = getUserFromSession();
        if (userFromSession != null) {
            model.addAttribute("user", userFromSession);
        } else {
            model.addAttribute("error", "error");
        }
        return "user/settings";
    }

    @PostMapping("updateUserUsername")
    public String updateUsername(@RequestParam String username,
                                 Model model) {
        User userFromSession = getUserFromSession();
        if (validationUsername(username) && userFromSession != null) {
            userFromSession.setUsername(username);
            userRepo.save(userFromSession);
            SecurityContextHolder.clearContext();
        } else {
            model.addAttribute("usernameError", "usernameError!");
        }
        return "redirect:/user/settings";
    }

    @PostMapping("updateUserPassword")
    public String updatePassword(@RequestParam String password,
                                 Model model) {
        User userFromSession = getUserFromSession();
        if (userFromSession != null) {
            userFromSession.setPassword(password);
            userRepo.save(userFromSession);
            SecurityContextHolder.clearContext();
        } else {
            model.addAttribute("passwordError", "passwordError!");
        }
        return "redirect:/user/settings";
    }

    @GetMapping("deleteUser")
    public String userEditForm() {
        User userFromSession = getUserFromSession();
        userRepo.deleteById(userFromSession.getId());
        SecurityContextHolder.clearContext();
        return "redirect:/";
    }

    private User getUserFromSession() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User userFromSession = null;
        if (principal instanceof User) {
            userFromSession = (User) principal;
        }
        return userFromSession;
    }
}
