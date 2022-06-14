package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.candyFactory;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.Bounty;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CandyBarFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;

public class BountyFactory implements CandyBarFactory {
    @Override
    public void WillReleaseABar(ChocolateBar chocolateBar) {
        System.out.println("запускаем завод по производству с банти");
        chocolateBar.ReleaseAChocolateBar();

    }
}
