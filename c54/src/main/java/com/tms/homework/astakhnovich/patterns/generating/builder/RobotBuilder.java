package by.astakhnovich.patterns.generating.builder;

import by.astakhnovich.patterns.generating.builder.components.*;

public class RobotBuilder implements Builder{
    private Body body;
    private Head head;
    private Legs legs;
    private Hands hands;

    @Override
    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    @Override
    public void setHands(Hands hands) {
        this.hands = hands;
    }

    @Override
    public void setBody(Body body) {
        this.body = body;
    }

    public Robot getResult(){
        return new Robot(body, head, legs, hands);
    }
}
