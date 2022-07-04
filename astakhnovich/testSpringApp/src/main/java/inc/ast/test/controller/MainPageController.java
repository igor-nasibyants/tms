package inc.ast.test.controller;

import inc.ast.test.model.product.Product;
import inc.ast.test.repository.ProductRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    private ProductRepo productRepo;

    public MainPageController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping
    public String index(Model model) {
        Iterable<Product> productList = productRepo.findAll();
        model.addAttribute("products", productList);
        return "main";
    }

}