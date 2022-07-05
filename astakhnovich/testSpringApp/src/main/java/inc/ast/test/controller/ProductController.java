package inc.ast.test.controller;

import inc.ast.test.model.product.Product;
import inc.ast.test.repository.ProductRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {
    ProductRepo productRepo;

    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/add")
    public String add(){
        return "product/addProduct";
    }

    @PostMapping("/add")
    public String add(@RequestParam(name="name") String name,
                      @RequestParam(name="price") String price,
                      @RequestParam(name="description") String description){
        Product product = new Product(name, price, description);
        productRepo.save(product);
        return "product/addProduct";
    }
}