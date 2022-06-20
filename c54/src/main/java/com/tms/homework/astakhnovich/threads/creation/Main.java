package by.astakhnovich.threads.creation;

public class Main {
    public static void main(String[] args) {
        ThreadHelloWorld threadHelloWorld = new ThreadHelloWorld();
        threadHelloWorld.start();


        RunnableHelloWorld runnableHelloWorld = new RunnableHelloWorld();
        Thread thread = new Thread(runnableHelloWorld);
        thread.start();
    }
}
