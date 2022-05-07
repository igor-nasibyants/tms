package by.mycompany.ast.entity;

import java.util.HashMap;
import java.util.Map;

public enum Role {
    USER("USER"),
    ADMIN("ADMIN");

    private final String stringRole;
    private static final Map<String, Role> LOOKUP_MAP = new HashMap<>();

    static {
        for (Role role : values()) {
            LOOKUP_MAP.put(role.getRole(), role);
        }
    }

    Role(String userRole) {
        this.stringRole = userRole;
    }

    public String getRole() {
        return stringRole;
    }

    public static Role getRoleByString(String role) {
        return LOOKUP_MAP.get(role);
    }
}
