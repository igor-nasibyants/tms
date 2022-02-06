package com.tms.homework.ArtsiomVladykouski.Task6;
import java.util.Random;
public class MyTask6 {
    public static void main(String[]args){
        //6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
        // Определить и вывести на экран сообщение о том,
        // является ли массив строго возрастающей последовательностью.
        Random r= new Random();
        Integer [] arrays=new Integer[4];
        int i;
        int temp1=0,temp2=0;
        for (i=0;i<4;i++){
            arrays[i]=r.nextInt(11);
            System.out.print(" "+arrays[i]+" ");
        }
        System.out.println("");
        for (i=0;i<arrays.length-1;i++){
            temp1=arrays[i];
            temp2=arrays[i+1];
        }
        if (temp2>temp1){
            System.out.print("Массив является строго возрастающей последовательностью");
        }
        else {
            System.out.print("Массив не является строго возрастающей последовательностью");
        }
    }
}
