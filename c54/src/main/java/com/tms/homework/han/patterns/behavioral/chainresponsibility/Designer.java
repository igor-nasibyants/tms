package com.tms.homework.han.patterns.behavioral.chainresponsibility;

public class Designer extends AbstractWorker{
    @Override
    public String execute(String command) {
        if (command.equalsIgnoreCase("спроектировать")) {
            return "Проектировщик спроектировал BMW-Audi";
        }
        return super.execute(command);
    }
}
