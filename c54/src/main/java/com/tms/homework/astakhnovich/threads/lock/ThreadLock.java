package by.astakhnovich.threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLock {
    public static void main(String []args){
        Lock lock = new ReentrantLock();
        Runnable task = () -> {
            lock.lock();
            Thread thread = Thread.currentThread();
            System.out.println("Hello from " + thread.getName());
            lock.unlock();
        };
        Thread thread0 = new Thread(task);
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread0.start();
        System.out.println("thread0 starts");
        thread1.start();
        System.out.println("thread1 starts");
        thread2.start();
        System.out.println("thread2 starts");
        thread3.start();
        System.out.println("thread3 starts");
    }
}
