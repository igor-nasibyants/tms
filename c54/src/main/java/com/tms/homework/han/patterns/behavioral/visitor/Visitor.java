package com.tms.homework.han.patterns.behavioral.visitor;

public interface Visitor {
    void visit(HanWorkShop shop);

    void visit(TeslaWorkShop shop);

    void visit(GrigorWorkShop shop);

    void visit(SergeyWorkShop shop);
}
