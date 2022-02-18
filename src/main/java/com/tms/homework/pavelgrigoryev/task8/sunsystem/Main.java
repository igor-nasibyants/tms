package com.tms.homework.pavelgrigoryev.task8.sunsystem;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.planets.Earth;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.planets.Mars;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.planets.Mercury;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.planets.Sun;

public class Main {
    public static void main(String[] args) {
        Sun sun = new Sun(1392700,5778);
        Mercury mercury = new Mercury(69700000,45900000,4878,87.97,350);
        Earth earth = new Earth(152000000,147000000,12756,365.3,22);
        Mars mars = new Mars(249000000,206700000,6794,687,-63);

        System.out.println("----------------------------------------------------------------------------------------");
        sun.introduce();
        System.out.println("diameter : " + sun.getDiameter() + " temperature : " + sun.getTemperature());
        sun.flyInTheVoid();
        System.out.println("----------------------------------------------------------------------------------------");
        mercury.introduce();
        System.out.println("diameter : " + mercury.getDiameter() + " temperature : " + mercury.getTemperature() + " maximum distance : " + mercury.getMaxDistance() +
                " minimum distance : " + mercury.getMinDistance() + " rotation period : " + mercury.getRotationPeriod());
        mercury.flyInTheVoid();
        System.out.println("----------------------------------------------------------------------------------------");
        earth.introduce();
        System.out.println("diameter : " + earth.getDiameter() + " temperature : " + earth.getTemperature() + " maximum distance : " + earth.getMaxDistance() +
                " minimum distance : " + earth.getMinDistance() + " rotation period : " + earth.getRotationPeriod());
        earth.flyInTheVoid();
        System.out.println("----------------------------------------------------------------------------------------");
        mars.introduce();
        System.out.println("diameter : " + mars.getDiameter() + " temperature : " + mars.getTemperature() + " maximum distance : " + mars.getMaxDistance() +
                " minimum distance : " + mars.getMinDistance() + " rotation period : " + mars.getRotationPeriod());
        mars.flyInTheVoid();
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
