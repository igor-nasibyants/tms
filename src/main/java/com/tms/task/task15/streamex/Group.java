package com.tms.task.task15.streamex;

import java.util.List;

public class Group {
    private List<User> members;

    public Group(List<User> members) {
        this.members = members;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
}
