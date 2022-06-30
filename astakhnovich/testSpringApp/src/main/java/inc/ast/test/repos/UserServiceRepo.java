package inc.ast.test.repos;

import inc.ast.test.entitys.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}