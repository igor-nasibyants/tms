package com.tms.homework.nikitaelenski.task34;


import java.util.Scanner;

public class Operation {
    public static char getOperation(Scanner scanner){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation(scanner);
        }
        return operation;
    }
}
