package com.tms.homework.pavelgrigoryev.task19.multithreading.task2;

public class RyanAndMonicaJob implements Runnable {
    private final BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob job = new RyanAndMonicaJob();
        Thread one = new Thread(job);
        Thread two = new Thread(job);
        one.setName("Райан");
        two.setName("Моника");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdrawal();
            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита!");
            }
        }
    }

    private void makeWithdrawal() {
        if (account.getBalance() >= 10) {
            System.out.println(Thread.currentThread().getName() + " собирается снять деньги");
            try {
                System.out.println(Thread.currentThread().getName() + " бежит подремать");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " просыпается");
            account.withdraw(10);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
        } else {
            System.out.println("Вот блин, для клиента " + Thread.currentThread().getName() + " недостаточно денег");
        }
        System.out.println("==================================================================================");
    }
}
