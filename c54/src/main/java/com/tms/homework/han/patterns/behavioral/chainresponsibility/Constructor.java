package com.tms.homework.han.patterns.behavioral.chainresponsibility;

public class Constructor extends AbstractWorker {
    @Override
    public String execute(String command) {
        if (command.equalsIgnoreCase("собрать")) {
            return "Конструктор собрал BMW-Audi";
        }
        return super.execute(command);
    }
}
