package com.tms.homework.nikitaelenski.task30.generative.builder.newBuilder;

public class Main {
    public static void main(String[] args) {
        RobotDirector robotDirector = new RobotDirector();
        RobotDirector robotDirector1 = new RobotDirector();


        robotDirector.setBuilder(new CardboardRobot());
        robotDirector1.setBuilder((new IronRobot()));


        System.out.println("-".repeat(50));
        robotDirector.buildRoboi();
        System.out.println("-".repeat(50));
        robotDirector1.buildRoboi();
        System.out.println("-".repeat(50));
        robotDirector.buildRoboi().setRightLeg("Железная ");
        robotDirector.buildRoboi();
    }
}
