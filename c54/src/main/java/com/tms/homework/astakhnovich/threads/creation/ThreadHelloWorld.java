package by.astakhnovich.threads.creation;

public class ThreadHelloWorld extends Thread{

    @Override
    public void run() {
        for (int i = 0; i<5; i++){
            System.out.println("hello world from thread's child");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
