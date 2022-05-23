package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.DrawingDesigner;

public class ChiefDesigner implements DrawingDesigner {
    @Override
    public void drawsADiagram() {
        System.out.println("Проверят схему кторую нарисовал малдший конструктор");
    }
}
