package com.tms.homework.han.epamTasks.basic;

//        Найти сумму квадратов первых ста чисел

public class Task14 {
    public static void main(String[] args) {
        getSum();
    }

    public static void getSum() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов от 0 до 100: " + sum);
    }
}
