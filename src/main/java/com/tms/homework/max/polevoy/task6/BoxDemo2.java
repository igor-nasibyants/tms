package com.tms.homework.max.polevoy.task6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        int volume;

        myBox1.width = 1;
        myBox1.height = 2;
        myBox1.depth = 3;

        myBox2.width = 5;
        myBox2.height = 10;
        myBox2.depth = 15;

        volume= myBox1.height * myBox1.width * myBox1.depth;
        System.out.println("Объем myBox1 = " + volume);

        volume= myBox2.height * myBox2.width * myBox2.depth;
        System.out.println("Объем myBox2 = " + volume);

        myBox1.setDim(1,2,3);
        myBox2.setDim(5,10,15);

        System.out.println("Объем myBox1 = " + myBox1.getVolume());
        System.out.println("Объем myBox2 = " + myBox2.getVolume());
    }


}
