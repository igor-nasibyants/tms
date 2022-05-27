package com.tms.homework.pavelgrigoryev.patterns.javaee.frontcontroller;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
        frontController.dispatchRequest("DASHBOARD");
        frontController.dispatchRequest("ERROR");
    }
}
