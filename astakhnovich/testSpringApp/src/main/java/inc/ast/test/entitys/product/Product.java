package inc.ast.test.entitys.product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String price;
    private String description;

    @ElementCollection(targetClass = TypeOfProduct.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "product_role", joinColumns = @JoinColumn(name = "product_id"))
    @Enumerated(EnumType.STRING)
    private Set<TypeOfProduct> typeOfProducts;

    public Product() {
    }

    public Product(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(getId(), product.getId()) && Objects.equals(getName(), product.getName()) && Objects.equals(getPrice(), product.getPrice()) && Objects.equals(getDescription(), product.getDescription()) && Objects.equals(typeOfProducts, product.typeOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice(), getDescription(), typeOfProducts);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", roles=" + typeOfProducts +
                '}';
    }
}