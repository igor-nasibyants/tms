package com.tms.homework.nikitaelenski.task30.generative.builder.newBuilder;

public class IronRobot extends RobotBuilder{
    @Override
    void buildHead() {
        robot.setHead("Делам Железную голову ");
        System.out.println("Делам Железную голову ");
    }

    @Override
    void buildTorso() {
        robot.setTorso("Делам Железное  тело");
        System.out.println("Делам Железное  тело");
    }

    @Override
    void buildLeftHand() {
        robot.setLeftHand("Делам Железную левую руку ");
        System.out.println("Делам Железную левую руку ");
    }

    @Override
    void buildRightHand() {
        robot.setRightHand("Делам Железную правую руку  ");
        System.out.println("Делам Железную правую руку  ");
    }

    @Override
    void buildLeftLeg() {
        robot.setLeftLeg("Делам Железную левую ноггу  ");
        System.out.println("Делам Железную левую ноггу  ");
    }

    @Override
    void buildRightLeg() {
        robot.setRightLeg("Делам Железную правую ногу  ");
        System.out.println("Делам Железную правую ногу  ");
    }

    @Override
    void buildSoftware() {
        robot.setSoftware("Версия прошивки 3.5.67");
        System.out.println("Версия прошивки 3.5.67");
    }
}
