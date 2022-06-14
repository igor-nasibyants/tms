package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.fabrica;


import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.candyFactory.BountyFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.Bounty;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CandyBarFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CreateChocolat;

public class BountyesFactory implements CreateChocolat {
    @Override
    public ChocolateBar createChocolateBar() {
        return new Bounty();
    }

    @Override
    public CandyBarFactory createCandyBarFactory() {
        return new BountyFactory();
    }
}
