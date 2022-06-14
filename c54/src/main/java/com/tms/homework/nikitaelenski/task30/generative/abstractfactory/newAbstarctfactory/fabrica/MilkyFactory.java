package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.fabrica;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.candyFactory.MilkyWayFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.MilkyWay;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CandyBarFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CreateChocolat;

public class MilkyFactory implements CreateChocolat {
    @Override
    public ChocolateBar createChocolateBar() {
        return new MilkyWay();
    }

    @Override
    public CandyBarFactory createCandyBarFactory() {
        return new MilkyWayFactory();
    }
}
