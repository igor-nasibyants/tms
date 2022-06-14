package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.fabrica;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.candyFactory.SnikersFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.Snikers;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CandyBarFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CreateChocolat;

public class SnikerssFactory implements CreateChocolat {
    @Override
    public ChocolateBar createChocolateBar() {
        return new Snikers();
    }

    @Override
    public CandyBarFactory createCandyBarFactory() {
        return new SnikersFactory();
    }
}
