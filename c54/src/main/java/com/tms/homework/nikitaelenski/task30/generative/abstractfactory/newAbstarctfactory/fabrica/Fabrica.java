package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.fabrica;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.Bounty;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.MilkyWay;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory.Snikers;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CreateChocolat;

public class Fabrica {
    public static ChocolateBar  FactoryForCreatingChocolateBars(String str){
        switch (str){
            case "Milky-Way":return new MilkyWay();
            case "Snickers":return new Snikers();
            case "Bounty":return new Bounty();
        }

        return null;
    }
    public  static CreateChocolat FactoryForCreatingChocolateBarsAndOll(String str){
        switch (str){
            case "Milky-Way":return new MilkyFactory();
            case "Snickers":return new SnikerssFactory();
            case "Bounty":return new BountyesFactory();
        }
        return null;
    }
}
