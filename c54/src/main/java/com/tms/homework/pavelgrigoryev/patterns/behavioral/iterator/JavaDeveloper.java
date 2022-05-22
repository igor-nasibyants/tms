package com.tms.homework.pavelgrigoryev.patterns.behavioral.iterator;

import java.util.List;

public class JavaDeveloper implements Collection {
    private String name;
    private final List<String> skills;

    public JavaDeveloper(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < skills.size();
        }

        @Override
        public Object next() {
            return skills.get(index++);
        }
    }
}
