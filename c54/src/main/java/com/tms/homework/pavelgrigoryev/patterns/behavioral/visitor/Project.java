package com.tms.homework.pavelgrigoryev.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project implements ProjectElement {
    List<ProjectElement> projectElements;

    public Project() {
        this.projectElements = new ArrayList<>(Arrays.asList(
                new ProjectClass(),
                new Database(),
                new Test()));
    }

    @Override
    public void beWritten(Developer developer) {
        projectElements.forEach(projectElement -> projectElement.beWritten(developer));
    }
}
