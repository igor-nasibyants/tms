package by.astakhnovich.patterns.generating.builder;

import by.astakhnovich.patterns.generating.builder.components.*;

public interface Builder {
    void setHead(Head head);
    void setLegs(Legs legs);
    void setHands(Hands hands);
    void setBody(Body body);
}
