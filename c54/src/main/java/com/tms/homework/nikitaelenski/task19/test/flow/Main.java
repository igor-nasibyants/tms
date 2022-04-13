package com.tms.homework.nikitaelenski.task19.test.flow;


public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread1 myThread = new MyThread1();
//        myThread.start();
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();

        Thread thread = new Thread(new Runner());
        thread.start();


//       System.out.println(" Я засыпаю ");
//       Thread.sleep(3000);
//       System.out.println("Я проснулся ");
//       IntStream.range(0,10).mapToObj(x-> "Hello").forEachOrdered(System.out::println);
    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        for(int x = 0 ; x <= 10 ; x++){
            System.out.println("Hello from Runner " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

    class MyThread1 extends Thread{
        public void run() {
            for(int x = 0 ; x <= 10 ; x++){
                System.out.println("Hello from MyThread" + x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
