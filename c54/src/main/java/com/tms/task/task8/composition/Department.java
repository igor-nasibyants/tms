package com.tms.task.task8.composition;

import java.util.List;

public class Department {
    private String name;
    private List<ActivityRoom> rooms;

    public Department(List<ActivityRoom> rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ActivityRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<ActivityRoom> rooms) {
        this.rooms = rooms;
    }

    public class PartDepartment {
        public static final int n = 10;
    }
}
