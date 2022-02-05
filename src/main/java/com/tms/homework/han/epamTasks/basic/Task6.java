package com.tms.homework.han.epamTasks.basic;

//        Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//        принадлежит закрашенной области, и false — в противном случае: x = (-4;4), y = (-4;4)

public class Task6 {
    public static void main(String[] args) {
        System.out.println(isArea(3, -2));
        System.out.println(isArea(4, -2));
        System.out.println(isArea(3, -4));
    }

    public static boolean isArea(int x, int y) {
        return x < 4 && x > -4 && y < 4 && y > -4;
    }
}
