package com.tms.homework.shumchenia.task3;

public class Task3 {

    public static void main(String[] args) {

        Chess();
    }

    public static void Chess() {
        char[][] array = new char[15][150];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    array[i][j] = '@';
                } else {
                    array[i][j] = '#';
                }
            }
        }
        for (char[] chars : array) {
            System.out.println();
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[j]);
            }
        }
    }
}
/*
  1 2 3 4 5 6 7
1 * # * # * # * # *
2 # * # * # * # * #
3 * # * # * # * # *
4 # * # * # * # * #
5 * # * # * # * # *
6 # * # * # * # * #
7 * # * # * # * # *
8 # * # * # * # * #
9 * # * # * # * # *
* */

