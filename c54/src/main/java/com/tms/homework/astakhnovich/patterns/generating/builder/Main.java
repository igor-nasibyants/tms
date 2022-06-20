package by.astakhnovich.patterns.generating.builder;

import by.astakhnovich.patterns.generating.builder.components.*;

public class Main {
    public static void main(String[] args) {
        RobotBuilder robotBuilder = new RobotBuilder();

        robotBuilder.setBody(new Body(true));
        robotBuilder.setHands(new Hands(true));
        robotBuilder.setLegs(new Legs(true));
        robotBuilder.setHead(new Head(true));
        Robot robot = robotBuilder.getResult();

        System.out.println(robot.toString());
    }
}
