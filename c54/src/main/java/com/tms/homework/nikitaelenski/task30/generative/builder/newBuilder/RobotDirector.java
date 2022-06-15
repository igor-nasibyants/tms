package com.tms.homework.nikitaelenski.task30.generative.builder.newBuilder;



public class RobotDirector {
    RobotBuilder builder ;

    public void setBuilder(RobotBuilder builder) {
        this.builder = builder;
    }
    Robot buildRoboi(){
        builder.creatRobar();
        builder.buildHead();
        builder.buildTorso();
        builder.buildLeftLeg();
        builder.buildRightLeg();
        builder.buildLeftHand();
        builder.buildRightHand();
        builder.buildSoftware();

        Robot robot = builder.getRobot();
        return robot;
    }
}
