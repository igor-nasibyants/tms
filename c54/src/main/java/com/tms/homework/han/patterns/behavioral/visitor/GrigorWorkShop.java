package com.tms.homework.han.patterns.behavioral.visitor;

public class GrigorWorkShop implements Place {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
