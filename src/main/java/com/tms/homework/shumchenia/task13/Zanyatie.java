package com.tms.homework.shumchenia.task13;

import java.util.*;

public class Zanyatie {
    public static void main(String[] args) {

        //System.out.println("task 1");
        //task1();
        //System.out.println("task 2");
        //task2();
        //System.out.println("task 3");
        //task3();
        //System.out.println("task 4");
        //task4();
        //System.out.println("task 5");
        //task5();
        System.out.println("task 6");
        task6();

    }

    private static void task6() {
        HashMap<Integer,Person> hashMap=new HashMap();
        System.out.println(hashMap.put(1,new Person(1,"a",2)));
        System.out.println(hashMap.put(1,new Person(1,"a",2)));
        System.out.println(hashMap.put(2,new Person(2,"a",2)));
        System.out.println(" ");
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.containsKey(1));
        for(Map.Entry<Integer,Person> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue() );
        }

    }

    private static void task5() {
        PersonComporator personComporator = new PersonComporator();
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person(1, "a", 15));
        treeSet.add(new Person(1, "x", 3));
        treeSet.add(new Person(2, "a", 15));
        treeSet.add(new Person(3, "b", 15));
        treeSet.add(new Person(4, "b", 16));
        treeSet.add(new Person(5, "c", 17));
        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void task4() {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person(1, "a", 15));
        hashSet.add(new Person(1, "x", 3));
        hashSet.add(new Person(2, "a", 15));
        hashSet.add(new Person(3, "b", 15));
        hashSet.add(new Person(4, "b", 16));
        hashSet.add(new Person(5, "c", 17));
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void task3() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(909);
        hashSet.add(956);
        hashSet.add(93);
        hashSet.add(949);
        hashSet.add(9579);
        System.out.println(hashSet);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(909);
        treeSet.add(956);
        treeSet.add(93);
        treeSet.add(949);
        treeSet.add(9579);
        System.out.println(treeSet);
    }

    private static void task2() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(1);
        linkedList.add(3);
        linkedList.add(1, 2);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println(linkedList.contains(2));
        System.out.println(linkedList.contains(5));
        System.out.println(linkedList);
    }

    public static void task1() {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        ArrayList<Integer> arrayList2 = new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2, 4);
        arrayList.add(2, 5);
        arrayList.add(2, 6);
        System.out.println(arrayList);
        arrayList2.addAll(arrayList);
        ListIterator<Integer> integerListIterator = arrayList2.listIterator();

        while (integerListIterator.hasNext()) {
            integerListIterator.add(0);
            System.out.println(integerListIterator.next());
        }

        for (Integer i : arrayList2) {
            System.out.println(i);
        }
        System.out.println(arrayList2);
        System.out.println(integerListIterator);
    }
}
