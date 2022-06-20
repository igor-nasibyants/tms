package by.astakhnovich.patterns.generating.builder;

import by.astakhnovich.patterns.generating.builder.components.*;
import java.util.Objects;

public class Robot {
    private Body body;
    private Head head;
    private Legs legs;
    private Hands hands;

    public Robot(Body body, Head head, Legs legs, Hands hands) {
        this.body = body;
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Hands getHands() {
        return hands;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(getBody(), robot.getBody()) && Objects.equals(getHead(), robot.getHead()) && Objects.equals(getLegs(), robot.getLegs()) && Objects.equals(getHands(), robot.getHands());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBody(), getHead(), getLegs(), getHands());
    }

    @Override
    public String toString() {
        return "Robot{" +
                body.toString() + ", " +
                head.toString() + ", " +
                legs.toString() + ", " +
                hands.toString() + "}";
    }
}