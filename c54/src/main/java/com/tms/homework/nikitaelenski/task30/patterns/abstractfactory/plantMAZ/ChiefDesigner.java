package com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.DrawingDesigner;

public class ChiefDesigner implements DrawingDesigner {
    @Override
    public void drawsADiagram() {
        System.out.println("Проверят схему кторую нарисовал малдший конструктор");
    }
}
