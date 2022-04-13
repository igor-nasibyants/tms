package com.tms.homework.shumchenia.task12.externaliz;

import java.io.*;

public class Logon implements Externalizable {
    private String login;
    private String password;

    public Logon() {
    }

    public Logon(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(login);
    }

    @Override
    public String toString() {
        return "Logon{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        login = (String) in.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Logon igor = new Logon("IgorIvanovich", "Khoziain");
        Logon renat = new Logon("Renat", "2500RUB");
        System.out.println("Before: \n" + igor);
        System.out.println(renat);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Externals.out"));
        out.writeObject(igor);
        out.writeObject(renat);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Externals.out"));
        igor = (Logon) in.readObject();
        renat = (Logon) in.readObject();

        System.out.println("After: \n" + igor);
        System.out.println(renat);
    }
}