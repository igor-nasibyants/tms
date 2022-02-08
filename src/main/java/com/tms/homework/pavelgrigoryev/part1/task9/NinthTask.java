package com.tms.homework.pavelgrigoryev.part1.task9;

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
      int first = 0;
      int second = 0;
      int input;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Укажите положительное число : ");
      if (scanner.hasNextInt()) {
          do {
              input = scanner.nextInt();
              if (input <= 0) {
                  System.out.println("Ошибка! Введите повторно положительное число : ");
              }
          } while (input <= 0);
          int[] array = new int[input];
          for (int i = 0; i < array.length; i++) {
              array[i] = (int) (Math.random() * 15);
              System.out.print(array[i] + " ");
              if (i < array.length/2 ){
                  first += array[i];
              } else {
                  second += array[i];
              }
          }
          System.out.println();
          if (first > second) {
              System.out.println("Сумма модулей первой половины массива больше и равна " + first);
          }
          if (second > first) {
              System.out.println("Сумма модулей второй половины массива больше и равна " + second);
          }
          if (second == first) {
              System.out.println("Сумма модулей первой и второй половины массива равны ");
          }
      } else {
          System.out.println("Ошибка! Введено не число ");
      }
    }
}
