package com.tms.homework.han.epamTasks.basic;

//        Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//        дробную и целую части числа и вывести полученное значение числа.


public class Task4 {
    public static void main(String[] args) {
        System.out.println(function(111.222));
    }

    public static double function(double r) {
        return (r * 1000) % 1000 + (int) r / 1000.0;
    }
}
