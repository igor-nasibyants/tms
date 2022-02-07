package com.tms.homework.astakhnovich.task1;

public class Task1 {

    public static void BinaryOperations() {

        System.out.println("\nПобитовый 'и'");
        System.out.println(Integer.toBinaryString(34210));
        System.out.println(Integer.toBinaryString(43205));
        System.out.println(Integer.toBinaryString(34210 & 43205));
        System.out.println(34210 & 43205);

        System.out.println("\nПобитовый 'или'");
        System.out.println(Integer.toBinaryString(34210));
        System.out.println(Integer.toBinaryString(43205));
        System.out.println(Integer.toBinaryString(34210 | 43205));
        System.out.println(34210 | 43205);

        System.out.println("\nXOR");
        System.out.println(Integer.toBinaryString(34210));
        System.out.println(Integer.toBinaryString(43205));
        System.out.println(Integer.toBinaryString(34210 ^ 43205));
        System.out.println(34210 ^ 43205);

        System.out.println("\nУнарное отрицание");
        System.out.println(Integer.toBinaryString(34210));
        System.out.println(Integer.toBinaryString(~34210));
        System.out.println(Integer.toBinaryString(43205));
        System.out.println(Integer.toBinaryString(~43205));

        System.out.println("\nСдвиг влево");
        Integer x = 64;//значение
        Integer y = 3;//количество

        System.out.println(Integer.toBinaryString(x));
        Integer z = (x << y);
        System.out.println(Integer.toBinaryString(z));

        Integer k = 26;

        Integer i = (x << k);
        System.out.println(Integer.toBinaryString(i));

        System.out.println("\nСдвиг вправо");
        x = 64;//значение
        y = 3;//количество

        System.out.println(Integer.toBinaryString(x));
        z = (x >> y);
        System.out.println(Integer.toBinaryString(z));

        k = 6;
        i = (x >> k);
        System.out.println(Integer.toBinaryString(i));

        System.out.println("\nСдвиг вправо с появлением нулей");
        x = 64;//значение
        y = 3;//количество

        System.out.println(Integer.toBinaryString(x));
        z = (x >>> y);
        System.out.println(Integer.toBinaryString(z));
    }
}
