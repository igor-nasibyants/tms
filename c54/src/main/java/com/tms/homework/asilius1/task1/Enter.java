package com.tms.homework.asilius1.task1;


import static com.tms.homework.asilius1.Main.readInput;

public class Enter {

    public static void menu() {
        int c, i;

        do {
            System.out.println("Выберите необходимое действие над числом:  ");
            System.out.println("1 - обнуление необходимого бита;");
            System.out.println("2 - побитовый сдвиг вправо/влево; ");
            System.out.println("0 - выход");
            c = readInput();

            switch (c) {
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
        while (c != 0);
    }

}