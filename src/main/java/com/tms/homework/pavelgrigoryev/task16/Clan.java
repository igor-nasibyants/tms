package com.tms.homework.pavelgrigoryev.task16;

import java.util.HashSet;
import java.util.Set;

public class Clan {
    private final int id;
    private final  int parent;
    private final String name;

    public Clan(int id, int parent, String name) {
        this.id = id;
        this.parent = parent;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clan{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", clans=" + clans +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    private final Set<Clan> clans = new HashSet<>();
}
