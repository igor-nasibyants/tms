package inc.ast.test.service;

import inc.ast.test.repository.UserServiceRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserService  implements UserDetailsService {
    private UserServiceRepo userServiceRepo;

    public UserService(UserServiceRepo userServiceRepo) {
        this.userServiceRepo = userServiceRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userServiceRepo.findByUsername(username);
    }
}