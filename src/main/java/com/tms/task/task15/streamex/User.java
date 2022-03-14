package com.tms.task.task15.streamex;

public class User {

    private final Role role;
    private final String name;

    public User(Role role, String name) {
        this.role = role;
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
