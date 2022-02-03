package com.tms.homework.artsiom.vladykouski.task1;

import com.tms.task.task5.Task5;
import com.tms.task.task6.Point;

public class Task1 {

    private static Integer number = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Point point = new Point(1,1);
        point.setX(2);
        point.setY(2);
//        Integer minValue = Integer.MIN_VALUE;
//        changeNum(minValue);
//        Task5.printThreeDimArray();
        System.out.println(point);
    }

    private static void changeNum(Integer newValue) {
        number = newValue;
    }

}