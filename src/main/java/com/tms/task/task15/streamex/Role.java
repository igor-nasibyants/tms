package com.tms.task.task15.streamex;

public class Role {
    private final String role;
    private final Boolean enabled;

    public Role(String role, Boolean enabled) {
        this.role = role;
        this.enabled = enabled;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public String getRole() {
        return role;
    }
}
