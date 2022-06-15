package com.tms.homework.nikitaelenski.task30.generative.builder.newBuilder;

public abstract class RobotBuilder extends Robot {
    Robot robot;
    void creatRobar(){
        robot = new Robot();
    }
    abstract void buildHead();
    abstract void buildTorso();
    abstract void buildLeftHand();
    abstract void buildRightHand();
    abstract void buildLeftLeg();
    abstract void buildRightLeg();
    abstract void buildSoftware();

    Robot getRobot(){
        return robot;
    }


}
