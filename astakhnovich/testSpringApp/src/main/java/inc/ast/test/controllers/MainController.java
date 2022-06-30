package inc.ast.test.controllers;

import inc.ast.test.entitys.product.Product;
import inc.ast.test.repos.ProductRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private ProductRepo productRepo;

    public MainController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping
    public String index(Model model) {
        Iterable<Product> productList = productRepo.findAll();
        model.addAttribute("products", productList);
        return "main";
    }

}