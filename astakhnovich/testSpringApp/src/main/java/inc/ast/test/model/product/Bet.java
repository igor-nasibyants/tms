package inc.ast.test.model.product;

import inc.ast.test.model.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Bet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", nullable = false)
    private Product productId;

    private String price;

    public Bet() {
    }

    public Bet(User userId, Product productId, String price) {
        this.userId = userId;
        this.productId = productId;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return Objects.equals(getId(), bet.getId()) && Objects.equals(getUserId(), bet.getUserId())
                && Objects.equals(getProductId(), bet.getProductId()) && Objects.equals(getPrice(), bet.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserId(), getProductId(), getPrice());
    }

    @Override
    public String toString() {
        return "Bet{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", price='" + price + '\'' +
                '}';
    }
}
