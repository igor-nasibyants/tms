package com.tms.task.task7;

import com.tms.task.task7.human.*;

public class Main {
    public static void main(String[] args) {
        Human1 h1 = new Person("Igor", 32);
        Client c = new Client("Client", 28, Sex.MAN);
        Client c1 = new Client("Client", 28, Sex.MAN);
        c.display();

        if (h1.equals(c1)) {
            System.out.println("Они одинаковые");
        } else if (c1.equals(h1)) {
            System.out.println("Они все таки одинаковые");
        }

        Human h = new Human("human", 18, Sex.MAN) {
            @Override
            public void talk() {

            }

            @Override
            public void listen() {

            }

            @Override
            public void walk() {

            }

            @Override
            public void print() {

            }
        };

        Human1 h2 = new Human1() {
            @Override
            public void walk() {

            }

            @Override
            public void talk() {

            }

            @Override
            public void listen() {

            }
        };

        System.out.println(h2);
    }
}
