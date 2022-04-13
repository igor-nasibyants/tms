package com.tms.task.task8;

import com.tms.task.task8.abstraction.Animal;
import com.tms.task.task8.abstraction.Lion;
import com.tms.task.task8.aggregation.Group;
import com.tms.task.task8.aggregation.Person;
import com.tms.task.task8.composition.ActivityRoom;
import com.tms.task.task8.composition.Department;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        abstraction();
//        composition();
        aggregation();
    }

    private static void abstraction() {
        Animal animal = new Lion();
        animal.sound();
    }

    private static void aggregation() {
        //creating objects of person class
        Person a = new Person("Tanmay", 17);
        Person b = new Person("Sam", 18);
        Person c = new Person("Pitu", 19);
        Person d = new Person("Khushi", 20);
//making a list of persons belongs to social welfare group
        List<Person> p1 = new ArrayList<>();
        p1.add(a);
        p1.add(c);
//making a list of persons belongs to drama fest group
        List<Person> p2 = new ArrayList<>();
        p2.add(b);
        p2.add(d);
//creating objects of group class
        Group swGrp = new Group("Social Welfare", p1);
        Group dfGrp = new Group("Drama Fest", p2);
//before deleting drama fest group
        System.out.println("List of persons in Drama Fest group:");
        for (Person p : p2) {
            System.out.println("Person name: " + p.getName() + ", Age:" + p.getAge() + ", Group: Drama Fest");
        }
//deleting drama fest group
        dfGrp = null;
//after deleting drama fest group
//person list will not destroy
        System.out.println("List of persons after deleting Drama Fest group:");
        for (Person p : p2) {
            System.out.println("Person name: " + p.getName() + ", Age: " + p.getAge());
        }
    }

    private static void composition() {
        // Creating the Objects of activity room class.
        ActivityRoom a1 = new ActivityRoom("Technical", 601);
        ActivityRoom a2 = new ActivityRoom("Business", 602);
        ActivityRoom a3 = new ActivityRoom("Economics", 603);

        // making the list of activity rooms.
        List<ActivityRoom> act = new ArrayList<>();
        act.add(a1);
        act.add(a2);
        act.add(a3);

        // Creating the Object of department class.
        Department d = new Department(act);

        // making the list of activity rooms in department.
        List<ActivityRoom> arlist = d.getRooms();
        for (ActivityRoom a : arlist) {
            System.out.println(a.subject + " activity room with id " + a.id);
        }
    }
}