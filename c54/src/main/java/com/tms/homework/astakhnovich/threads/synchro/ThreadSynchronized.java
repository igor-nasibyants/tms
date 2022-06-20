package by.astakhnovich.threads.synchro;

public class ThreadSynchronized {
    public static volatile Integer i = 0;

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            for (int i = 0; i<1000000; i++){
                System.out.println("th 1 = " + incr());
            }
        };

        Runnable runnable2 = () -> {
            for (int i = 0; i<1000000; i++){
                System.out.println("th 2 = " + incr());
            }
        };
        Runnable runnable3 = () -> {
            for (int i = 0; i<1000000; i++){
                System.out.println("th 3 = " + incr());
            }
        };

        Runnable runnable4 = () -> {
            for (int i = 0; i<1000000; i++){
                System.out.println("th 4 = " + incr());
            }
        };

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);
        Thread th3 = new Thread(runnable3);
        Thread th4 = new Thread(runnable4);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }

    public static synchronized Integer incr(){
        return i++;
    }
}