package com.tms.homework.han.patterns.behavioral.chainresponsibility;

public class Main {
    public static void main(String[] args) {
    Designer designer = new Designer();
    Constructor carpenters = new Constructor();
    Vendor finishingWorker = new Vendor();

    designer.setNextWorker(carpenters).setNextWorker(finishingWorker);

    giveCommand(designer, "спроектировать");
    giveCommand(designer, "собрать");
    giveCommand(designer, "продать");
    giveCommand(designer, "кушать жаб");
    }

    private static void giveCommand(Worker worker, String command) {
        String str = worker.execute(command);
        if (str.equals("")) {
            System.out.println(command + " - эту работу никто не умеет выполнять");
        }
        else {
            System.out.println(str);
        }
    }
}
