package com.tms.homework.han.patterns.behavioral.chainresponsibility;

public interface Worker {
    Worker setNextWorker(Worker worker);
    String execute(String command);
}
