package com.tms.homework.han.epamTasks.basic;

//        Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//                (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Значение выражения: " + calcValue(2.4, 3.2));
    }

    public static double calcValue(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
