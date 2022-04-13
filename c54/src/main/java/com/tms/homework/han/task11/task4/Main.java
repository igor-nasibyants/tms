package com.tms.homework.han.task11.task4;

//Write a method readNumber(int start, int end), that read from
//        console integer number and return it, if it is in the range
//        [start...end].
//        If an invalid number or non-number text is read, the method
//        should throw an exception.
//        Using this method write a method main(), that has to enter 10
//        numbers:
//        a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

import com.tms.homework.han.task11.task1.MyException;

import java.util.Scanner;

public class Main extends GetView implements CheckMore, CheckLess {
    public Main(int[] arr) {
        super(arr);
    }

    public static void main(String[] args) {
        readNumber(0, 15);
    }

    public static void readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int enter;
        for (int i = 0; i < arr.length; ) {
            System.out.println("Введите " + (i + 1) + " целое число [" + start + "..." + end + "]:");
            if (scanner.hasNextInt()) {
                enter = scanner.nextInt();
                if (enter >= start && enter <= end) {
                    arr[i] = enter;
                    i++;
                }
                try {
                    CheckMore.checkMore(enter, end);
                    CheckLess.checkLess(enter, start);
                } catch (MyException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    throw new MyException("Вы ввели не число (или вещественное число)!!");
                } catch (MyException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        }
        GetView viewArray = new GetView(arr);
        System.out.println("Результат: " + viewArray);
    }
}
