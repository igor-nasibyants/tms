package com.tms.homework.han.task5;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] arr = new char[3][3];
        int x;
        int y;
        boolean nextStep = true;
        boolean isRepeat = true;
        int count = 0;
        printArr(arr);
        while (isRepeat) {
            if (count >= 9) {
                System.out.println("Победила дружба");
                break;
            }
            while (nextStep) {
                if (!check(arr, '0')) {
                    System.out.println("Победил второй игрок");
                    isRepeat = false;
                    break;
                }
                System.out.println("Первый игрок, введите координаты клетки, в которую поставить 'X'");
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (arr[x][y] != 'X' && arr[x][y] != '0') {
                    arr[x][y] = 'X';
                    count++;
                    nextStep = false;
                }
                printArr(arr);
            }
            while (!nextStep) {
                if (count >= 9) {
                    break;
                }
                if (!check(arr, 'X')) {
                    System.out.println("Победил первый игрок");
                    isRepeat = false;
                    break;
                }
                System.out.println("Второй игрок, введите координаты клетки, в которую поставить '0'");
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (arr[x][y] != 'X' && arr[x][y] != '0') {
                    arr[x][y] = '0';
                    count++;
                    nextStep = true;
                }
                printArr(arr);
            }
        }
    }


    public static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean check(char[][] arr, char symbol) {
        boolean isRepeat = true;
        if ((arr[0][0] == symbol && arr[0][1] == symbol && arr[0][2] == symbol) ||
                (arr[1][0] == symbol && arr[1][1] == symbol && arr[1][2] == symbol) ||
                (arr[2][0] == symbol && arr[2][1] == symbol && arr[2][2] == symbol) ||
                (arr[0][0] == symbol && arr[1][0] == symbol && arr[2][0] == symbol) ||
                (arr[0][1] == symbol && arr[1][1] == symbol && arr[2][1] == symbol) ||
                (arr[0][2] == symbol && arr[1][2] == symbol && arr[2][2] == symbol) ||
                (arr[0][0] == symbol && arr[1][1] == symbol && arr[2][2] == symbol) ||
                (arr[2][0] == symbol && arr[1][1] == symbol && arr[0][2] == symbol)) {
            isRepeat = false;
        }
        return isRepeat;
    }
}
