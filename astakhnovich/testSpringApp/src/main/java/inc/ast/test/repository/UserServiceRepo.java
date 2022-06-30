package inc.ast.test.repository;

import inc.ast.test.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}