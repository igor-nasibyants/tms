package com.tms.homework.han.patterns.behavioral.visitor;

public class Man implements Visitor {
    String value;

    @Override
    public void visit(HanWorkShop shop) {
        value = "У Han все очень круто!!!";
    }

    @Override
    public void visit(TeslaWorkShop shop) {
        value = "У Tesla такое себе";
    }

    @Override
    public void visit(GrigorWorkShop shop) {
        value = "У Grigor круто!!!";
    }

    @Override
    public void visit(SergeyWorkShop shop) {
        value = "У Sergey тоже круто!!!";
    }
}
