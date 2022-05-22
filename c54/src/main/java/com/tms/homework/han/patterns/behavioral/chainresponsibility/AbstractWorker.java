package com.tms.homework.han.patterns.behavioral.chainresponsibility;

abstract class AbstractWorker implements Worker {
    private Worker nextWorker;

    public AbstractWorker() {
        nextWorker = null;
    }

    @Override
    public String execute(String command) {
        if (nextWorker != null) {
            return nextWorker.execute(command);
        }
        return "";
    }

    @Override
    public Worker setNextWorker(Worker worker) {
        nextWorker = worker;
        return worker;
    }
}
