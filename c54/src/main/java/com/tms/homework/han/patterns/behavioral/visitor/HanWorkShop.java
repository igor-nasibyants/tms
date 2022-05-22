package com.tms.homework.han.patterns.behavioral.visitor;

public class HanWorkShop implements Place{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
