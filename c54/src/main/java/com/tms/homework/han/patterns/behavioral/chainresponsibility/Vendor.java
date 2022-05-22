package com.tms.homework.han.patterns.behavioral.chainresponsibility;

public class Vendor extends AbstractWorker{
    @Override
    public String execute(String command) {
        if (command.equalsIgnoreCase("продать")){
            return "Продавец продал BMW-Audi";
        }
        return super.execute(command);
    }
}
