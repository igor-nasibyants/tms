package com.tms.homework.nikitaelenski.task19.exercise3;


import java.util.ArrayList;

public class Main {
    public static int number;
    public static int number1;
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MyList());
        Thread thread1 = new Thread(new MyList());
        thread.start();
        Thread.sleep(1000);
        System.out.println("Стоп");
        thread1.start();
        try {
            thread.join();
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        increceNumber();
    }
    public static synchronized void increceNumber(){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(Main.number);

        if (number1 %2 == 0){
            list1.add(Main.number1);
        }else{
            list1.add(0);
        }
        number++;
        number1++;

        System.out.println(list + " " + list1);
    }

}
