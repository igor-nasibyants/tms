package com.tms.task.task19;

public class JavaDaemonThread {

    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread("dt");
        dt.setDaemon(true);
        dt.start();
        Thread.sleep(30000);
        System.out.println("Finishing program");
    }
}
