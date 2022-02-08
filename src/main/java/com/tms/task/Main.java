package com.tms.task;

import com.tms.task.task3.Task3;
import com.tms.task.task4.Task4;
import static com.tms.task.task4.Task4.*;
import com.tms.task.task5.Task5;
import com.tms.task.task6.Person;
import static com.tms.task.task6.Person.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        task6();
        System.out.println("==================================");
    }

    private static void task6() {
        Person p = new Person();
//        Person p1 = new Person(20, "Peter");
        Person p2 = new Person(39);
        Person p3 = new Person( "Ivan");

        p.printChangedPerson();
        p2.printChangedPerson();
        p3.printChangedPerson();
//        String pName = p2.getName();
//        System.out.println("p1 is " + p2.getInfo());
//        printDefault();
    }

    private static void task5() {
//    Task5.twoDimArray();
//        Task5.printTriangle();
//        Task5.printThreeDimArray();
    }

    private static void task4() {
//        int[] sortedArray = Task4.bubbleSort(new int[] {4,3,1,6,7,8,3,2,2});
        int[] sortedArray = shakerSort(new int[] {4,3,1,6,7,8,3,2,2});
//        int[] sortedArray = Task4.quickSort(new int[] {4,3,1,6,7,8,3,2,2}, 0, 8);
//        int[] sortedArray = Task4.mergeSort(new int[] {4,3,1,6,7,8,3,2,2}, 0, 8);
//        int[] sortedArray = Task4.selectionSort(new int[] {4,3,1,6,7,8,3,2,2});
//        int[] sortedArray = Task4.heapSort(new int[] {4,3,1,6,7,8,3,2,2});
        Task4.printArray(sortedArray);
    }

    private static void task3(){
//        Task 3.1 example start
//        System.out.println("Is month has valid number of days?");
//        System.out.println("The result is " + Task3.validateMonth(45));
//        Task 3.1 example end

//        Task 3.2 example start
//        System.out.println("Сегодня второй день недели, а значит это  " + Task3.nameOfDay(2));
//        Task 3.2 example end

//        Task 3.3 example start
//        System.out.println(Task3.checkNumberConditions(7));
//        Task 3.3 example end

//        Task 3.4 example start
//        System.out.println("четные числа: ");
//        Task3.printOnlyOddPositive(7);
//        Task 3.4 example end

//        Task 3.5 example start
//        System.out.println("Первое четное число из списка 1,3,5,8,2: " + Task3.getFirstOdd(Arrays.asList(1,3,5,8,2)));
//        Task 3.5 example end

//        Task 3.6 example start
//        Task3.printRandomLessThen10();
//        Task 3.6 example end

//        Task 3.7 example start
//        Task3.printTwice();
//        Task 3.7 example end

//        Task 3.8 example start
        Task3.printAtLeastOnce();
//        Task 3.8 example end
    }
}
