package com.tms.homework.pavelgrigoryev.patterns.creational.prototype;

public class Project implements Copyable {
    private int id;
    private final String projectName;
    private final String sourceCode;

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
