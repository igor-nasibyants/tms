package com.tms.homework.shumchenia.task12.test;

import java.io.*;

public class Talda implements Serializable {
    private String name;
    private String description;

    public Talda(String name, String description) {
        this.name = name;
        this.description = description;
    }


    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        System.out.println("Our writeObject");
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        System.out.println("Our readObject");
    }

    @Override
    public String toString() {
        return "Talda{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Talda partizanka = new Talda("Partizanka", "Viiiski");
        System.out.println("Before: \n" + partizanka);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Talda.out"));
        out.writeObject(partizanka);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Talda.out"));
        partizanka = (Talda) in.readObject();

        System.out.println("After: \n" + partizanka);
    }
}