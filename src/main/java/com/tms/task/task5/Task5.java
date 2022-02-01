package com.tms.task.task5;

public class Task5 {

    public static void twoDimArray() {
        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        twoDimArray[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;
        printTwoDimArray(twoDimArray);
    }

    public static void printTriangle() {
        //объявляем и создаём массив, указывая только количество строк
        int[][] twoDimArray = new int[5][];

        //инициализируем массив, заполняя его массивами разной длины
        twoDimArray[0] = new int[]{1, 2, 3, 4, 5};
        twoDimArray[1] = new int[]{1, 2, 3, 4};
        twoDimArray[2] = new int[]{1, 2, 3};
        twoDimArray[3] = new int[]{1, 2};
        twoDimArray[4] = new int[]{1};
        //выведем получившийся непрямоугольный двумерный массив на экран
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printThreeDimArray() {
        //задаем булев трёхмерный массив. На этой парковке есть 3 этажа, на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false)
        boolean[][][] parkingLot = new boolean[3][2][5];
        //приехало две машины и припарковались на нулевом этаже в ячейке [1][0] и [1][3]
        parkingLot[0][1][0] = true;
        parkingLot[0][1][3] = true;

        //Выведем массив в консоль
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "   ");

                }
                System.out.println();
            }
        }
    }

    private static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
