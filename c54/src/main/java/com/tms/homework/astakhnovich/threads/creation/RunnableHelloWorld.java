package by.astakhnovich.threads.creation;

public class RunnableHelloWorld implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<5; i++){
            System.out.println("hello world from implementation Runnable");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
