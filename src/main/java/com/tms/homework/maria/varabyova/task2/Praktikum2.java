package com.tms.homework.maria.varabyova.task2;

public class Praktikum2 {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {// В тренировке должно выполниться 5 кругов
            System.out.println("Круг " + i);


            if (i % 2 == 0) { // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                for (int j = 1; j <= 5; j++) { // Если да, то присесть 5 раз
                    System.out.println("  Приседаем " + j);
                }

            } else { //аче нужно отжаться 3 раза
                for (int k = 1; k <= 3; k++) {
                    System.out.println("  Отжимаемся " + k);
                }
            }

            for (int h = 1; h <= 7; h++) {// Независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + h);
            }

            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }


            System.out.println("Отлично позанимались сегодня! Вы - молодец!");

        }

    }

