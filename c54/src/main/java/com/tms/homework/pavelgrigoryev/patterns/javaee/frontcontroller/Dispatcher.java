package com.tms.homework.pavelgrigoryev.patterns.javaee.frontcontroller;

public class Dispatcher {
    private final StudentView studentView;
    private final HomeView homeView;
    private final DashboardView dashboardView;
    private final ErrorView errorView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
        dashboardView = new DashboardView();
        errorView = new ErrorView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else if (request.equalsIgnoreCase("DASHBOARD")) {
            dashboardView.show();
        } else if (request.equalsIgnoreCase("HOME")) {
            homeView.show();
        } else errorView.show();
    }
}
