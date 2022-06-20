package by.astakhnovich.threads.interrupt;

public class ThreadInterrupt {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            int i = 1;
            while (!Thread.currentThread().isInterrupted()){
                System.out.println(i++);
            }
        };

        Thread th = new Thread(runnable);
        th.start();
        int a = 0;
        for (int i = 0; i<100000; i++);{
            a++;
        }
        th.interrupt();
    }
}
