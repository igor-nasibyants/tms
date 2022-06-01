package com.tms.homework.nikitaelenski.task34;

import java.util.Scanner;

public class NextInt {
public static int nextInt(Scanner scan){
    System.out.println("Введите число");
    int operand;
    if(scan.hasNextInt()){
        operand = scan.nextInt();
    } else {
        System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
        scan.next();//рекурсия
        operand = scan.nextInt();
    }
    return operand;

}
}
