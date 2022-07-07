package inc.ast.test.controller;

import inc.ast.test.model.product.Bet;
import inc.ast.test.model.product.Product;
import inc.ast.test.model.product.TypeOfProduct;
import inc.ast.test.model.user.User;
import inc.ast.test.repository.BetRepo;
import inc.ast.test.repository.ProductRepo;
import inc.ast.test.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {
    ProductRepo productRepo;
    BetRepo betRepo;
    @Autowired
    UserRepo userRepo;

    public ProductController(ProductRepo productRepo, BetRepo betRepo) {
        this.productRepo = productRepo;
        this.betRepo = betRepo;
    }

    @GetMapping("/add")
    public String add(){
        return "product/addProduct";
    }

    @PostMapping("/add")
    public String add(@RequestParam(name="name") String name,
                      @RequestParam(name="price") String price,
                      @RequestParam(name="description") String description,
                      @RequestParam(name="role") String role){
        Product product = new Product(name, description);
        switch (role) {
            case "PC" -> product.setTypeOfProducts(TypeOfProduct.PC);
            case "PHONE" -> product.setTypeOfProducts(TypeOfProduct.PHONE);
            case "TABLET" -> product.setTypeOfProducts(TypeOfProduct.TABLET);
        }

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof User){
            User user = (User) principal;
            Bet bet = new Bet(user, product, price);
            productRepo.save(product);
            betRepo.save(bet);
        }
        return "redirect:/";
    }
}