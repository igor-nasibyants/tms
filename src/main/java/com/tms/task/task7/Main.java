package com.tms.task.task7;

import com.tms.task.task7.human.Client;
import com.tms.task.task7.human.Human;
import com.tms.task.task7.human.Human1;
import com.tms.task.task7.human.Person;

public class Main {
    public static void main(String[] args) {
        Human1 h1 = new Person("Igor", 32);
        Client c = new Client("Client", 28);
        c.display();

        Human h = new Human("human", 18) {
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
