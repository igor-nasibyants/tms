package com.tms.homework.nikitaelenski.task30.generative.builder.newBuilder;

public class Robot {
    private String head;
    private String torso;
    private String LeftHand;
    private String rightHand;
    private String LeftLeg;
    private String rightLeg;
    private String Software;



    public void setHead(String head) {
        this.head = head;
    }

    public void setTorso(String torso) {
        this.torso = torso;
    }

    public void setLeftHand(String leftHand) {
        LeftHand = leftHand;
    }

    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }

    public void setLeftLeg(String leftLeg) {
        LeftLeg = leftLeg;
    }

    public void setRightLeg(String rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void setSoftware(String software) {
        Software = software;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", torso='" + torso + '\'' +
                ", LeftHand='" + LeftHand + '\'' +
                ", rightHand='" + rightHand + '\'' +
                ", LeftLeg='" + LeftLeg + '\'' +
                ", rightLeg='" + rightLeg + '\'' +
                ", Software=" + Software +
                '}';
    }
}
