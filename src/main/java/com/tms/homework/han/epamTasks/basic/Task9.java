package com.tms.homework.han.epamTasks.basic;

//        Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task9 {
    public static void main(String[] args) {
        isOneLine(1, 8, -2, -7, -4, -17);
    }

    public static void isOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }
}
