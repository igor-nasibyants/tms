package com.tms.homework.asilius1.task1;


import java.util.Scanner;

public class Enter {

    public static void menu() {
        Scanner str = new Scanner(System.in);

        int c,i;

        do{
            System.out.println("Выберите необходимое действие над числом:  ");
            System.out.println("1 - обнуление необходимого бита;");
            System.out.println("2 - побитовый сдвиг вправо/влево; ");
            System.out.println("0 - выход");
            c = str.nextInt();

            switch (c){
                case 1:
                    Functional.bitReset();
                    break;
                case 2:
                    Functional.bitShift();
                    break;
                case 0:
                    break;
            }
    }
        while (c!=0);
    }

}