package by.astakhnovich.threads.interrupt;

public class ThreadInterruptEx {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            int secToWait = 1000 * 60;
            try {
                Thread.sleep(secToWait);
            } catch (InterruptedException e) {
                System.err.println("InterruptEx");
            }
        };

        Thread th = new Thread(runnable);
        th.start();

        th.interrupt();
    }
}
