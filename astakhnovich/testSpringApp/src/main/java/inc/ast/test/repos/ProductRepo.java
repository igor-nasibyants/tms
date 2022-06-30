package inc.ast.test.repos;

import inc.ast.test.entitys.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}