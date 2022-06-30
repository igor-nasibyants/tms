package inc.ast.test.repository;

import inc.ast.test.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
    User findById(String id);
}
