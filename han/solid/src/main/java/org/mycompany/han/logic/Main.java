package org.mycompany.han.logic;

import org.mycompany.han.model.HumanSpeak;
import org.mycompany.han.model.SuperHero;

public class Main {
    public static void main(String[] args) {
        SuperHero superMan = new SuperHero(35, "Super-Man", 100);
        HumanSpeak human = new HumanSpeak(30, "Vasya");

        System.out.println(superMan.superPower());
        System.out.println(human.speak());
        System.out.println(superMan.speak());

    }
}
