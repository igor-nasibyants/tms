package com.tms.homework.asilius1.task7.data;

import com.tms.homework.asilius1.task7.data.persons.Checkable;
import com.tms.homework.asilius1.task7.data.persons.Person;

import java.util.Scanner;

public class Client extends Person implements Checkable, Readable {

    private static final Scanner str = new Scanner(System.in);

    public Client(String firstName, String secondName, Integer birthNumber, Months months, Integer yearOfBirth, Sex sex) {
        super(firstName, secondName, birthNumber, months, yearOfBirth, sex);
    }

    @Override
    public void checkOfResident() {

    }

    @Override
    public void checkOfNationality() {

    }


    @Override
    public int readInt() {
        return str.nextInt();
    }

    @Override
    public String readString() {
        return str.next();
    }
}
