package com.tms.homework.nikitaelenski.task34;

import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    private static  int result;
    public static void main(String[] args) {
        int x = NextInt.nextInt(scanner);
        int y = NextInt.nextInt(scanner);
        char ch = Operation.getOperation(scanner);

        switch (ch) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        System.out.println(result);
    }

}
