package com.tms.task.task8.aggregation;

import java.util.List;

public class Group {

    private String groupName;
    private List<Person> persons;

    public Group(String groupName, List<Person> persons) {
        this.groupName = groupName;
        this.persons = persons;
    }
}
