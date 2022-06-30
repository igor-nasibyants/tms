package inc.ast.test.model.user;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, PROVIDER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}