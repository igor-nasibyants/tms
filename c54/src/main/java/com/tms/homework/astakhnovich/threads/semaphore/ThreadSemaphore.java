package by.astakhnovich.threads.semaphore;

import java.util.concurrent.Semaphore;

public class ThreadSemaphore {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);

        Runnable runnable = () -> {
            try {
                sem.acquire();
                String thName = Thread.currentThread().getName();
                System.out.println (thName + " садится за стол");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " поел");
                sem.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread aristotel = new Thread(runnable);
        aristotel.setName("aristotel");
        aristotel.start();

        Thread socrat = new Thread(runnable);
        socrat.setName("socrat");
        socrat.start();

        Thread platon = new Thread(runnable);
        platon.setName("platon");
        platon.start();

        Thread kant = new Thread(runnable);
        kant.setName("kant");
        kant.start();

        Thread dekart = new Thread(runnable);
        dekart.setName("dekart");
        dekart.start();
    }
}
