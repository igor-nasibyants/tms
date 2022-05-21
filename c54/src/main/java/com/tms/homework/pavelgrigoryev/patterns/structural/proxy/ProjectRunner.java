package com.tms.homework.pavelgrigoryev.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/beach/project");

        project.run();
    }
}
