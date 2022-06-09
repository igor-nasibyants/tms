package com.tms.homework.pavelgrigoryev.task36;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> weakMap = new WeakHashMap<>();

        System.out.println("=================================================");
        weakMap.put(101, "IN");
        weakMap.put(102, "US");
        System.out.println("Initial WeakHashMap is --> " + weakMap);
        System.out.println("Returns the older value which is replaced --> " + weakMap.put(101, "CA"));
        System.out.println("WeakHashMap with duplicate key, it replaced the new value --> " + weakMap);
        weakMap.put(103, "CA");
        System.out.println("WeakHashMap with duplicate values --> " + weakMap);

        System.out.println("=================================================");
        Map<Integer, String> newWeakMap = new HashMap<>();
        newWeakMap.put(200, "AUS");
        weakMap.putAll(newWeakMap);
        System.out.println("WeakHashMap after putAll --> " + weakMap);

        System.out.println("=================================================");
        System.out.println("Return the value for the given key --> " + weakMap.get(101));
        System.out.println("Return the value which is removed for the given key --> " + weakMap.remove(101));
        System.out.println("WeakHashMap after the removal is --> " + weakMap);
        System.out.println("Does the WeakHashMap contains the key 102? --> " + weakMap.containsKey(102));
        System.out.println("Does the WeakHashMap contains the Value IN? --> " + weakMap.containsValue("IN"));
        System.out.println("WeakHashMap isEmpty? --> " + weakMap.isEmpty());
        System.out.println("WeakHashMap size --> " + weakMap.size());

        System.out.println("=================================================");
        System.out.println("To get all the keys --> " + weakMap.keySet());
        System.out.println("To get all the values --> " + weakMap.values());
        System.out.println("To get all the entries --> " + weakMap.entrySet());

        System.out.println("=================================================");
        Map<Employee, String> hashMap = new HashMap<>();
        Employee andrey = new Employee();
        hashMap.put(andrey, "US");
        System.out.println("Original HashMap contains --> " + hashMap);
        andrey = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("HashMap after the GC contains --> " + hashMap);

        System.out.println("=================================================");
        Map<Employee, String> weakHashMap = new WeakHashMap<>();
        Employee alex = new Employee();
        weakHashMap.put(alex, "US");
        System.out.println("Original WeakHashMap contains --> " + weakHashMap);
        alex = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("WeakHashMap after the GC contains --> " + weakHashMap);
    }
}
