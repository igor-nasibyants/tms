package com.tms.homework.nikitaelenski.task30.generative.builder.newBuilder;

public class CardboardRobot extends RobotBuilder{
    @Override
    void buildHead() {
        robot.setHead("Делам картонную голову ");
        System.out.println();
    }

    @Override
    void buildTorso() {
        robot.setTorso("Делам картоное тело");
        System.out.println("Делам картоное тело");
    }

    @Override
    void buildLeftHand() {
        robot.setLeftHand("Делам картонную левую руку ");
        System.out.println("Делам картонную левую руку ");
    }

    @Override
    void buildRightHand() {
        robot.setRightHand("Делам картонную правую руку  ");
        System.out.println("Делам картонную правую руку  ");
    }

    @Override
    void buildLeftLeg() {
        robot.setLeftLeg("Делам картонную левую ноггу  ");
        System.out.println("Делам картонную левую ноггу  ");
    }

    @Override
    void buildRightLeg() {
        robot.setRightLeg("Делам картонную правую ногу  ");
        System.out.println("Делам картонную правую ногу  ");
    }

    @Override
    void buildSoftware() {
        robot.setSoftware("Версия прошивки 3.5.67");
        System.out.println("Версия прошивки 3.5.67");
    }
}
