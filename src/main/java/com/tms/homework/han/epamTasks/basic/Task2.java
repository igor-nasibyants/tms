package com.tms.homework.han.epamTasks.basic;

//        Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//                (𝑏 + √(𝑏^2 + 4𝑎𝑐)) / 2𝑎 − 𝑎^3*𝑐 + 𝑏^−2

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Значение выражения: " + calcValue(1.3, 4.7, 0.6));
    }

    public static double calcValue(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
