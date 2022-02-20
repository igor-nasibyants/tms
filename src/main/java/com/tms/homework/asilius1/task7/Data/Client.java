package com.tms.homework.asilius1.task7.Data;

import com.tms.homework.asilius1.task7.Data.Months;
import com.tms.homework.asilius1.task7.Data.Persons.Checkable;
import com.tms.homework.asilius1.task7.Data.Persons.Person;
import com.tms.homework.asilius1.task7.Data.Readable;
import com.tms.homework.asilius1.task7.Data.Sex;

import java.util.Scanner;

public class Client extends Person implements Checkable, Readable {

    private static Scanner str = new Scanner(System.in);

    Client(String firstName, String secondName, Integer birthNumber, Months months, Integer yearofBirth, Sex sex) {
        super(firstName, secondName, birthNumber, months, yearofBirth, sex);
    }

    @Override
    public void checkofResident() {

    }

    @Override
    public void checkofNationality() {

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
