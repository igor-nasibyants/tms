package inc.ast.test.controller;

import inc.ast.test.model.product.Bet;
import inc.ast.test.model.product.Product;
import inc.ast.test.model.user.User;
import inc.ast.test.repository.BetRepo;
import inc.ast.test.repository.ProductRepo;
import org.apache.juli.logging.Log;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class MainPageController {
    private ProductRepo productRepo;
    private BetRepo betRepo;
    Log4J2LoggingSystem log4J2LoggingSystem;

    public MainPageController(ProductRepo productRepo, BetRepo betRepo) {
        this.productRepo = productRepo;
        this.betRepo = betRepo;
    }

    @GetMapping
    public String index(Model model) {
        Iterable<Product> productList = productRepo.findAll();
        model.addAttribute("products", productList);
        return "main";
    }

    @PostMapping("getBetsByProductId")
    public String getBetsByProductId(@RequestParam String currentProductId, Model model){
        Long productId = Long.valueOf(currentProductId);
        Bet betFromDbByProductId = betRepo.findByProductId(productId);
        model.addAttribute("betFromDbByProductId", betFromDbByProductId.getPrice());
        return "main";
    }

    @GetMapping("isAuthorized")
    public String isAuthorized(Model model){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof User){
            User user = (User) principal;
            String username = user.getUsername();
            model.addAttribute("userForHeader", user.getUsername());
        }else {
            model.addAttribute("userForHeader", "unknown");
        }
        return "main";
    }
}