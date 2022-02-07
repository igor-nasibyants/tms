package com.tms.homework.max.polevoy.task6;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        // присваиваем значение переменным объекта myBox
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 30;
        // расчитываем объем
        int volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Объем = " + volume);

    }
}
