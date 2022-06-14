package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CandyBarFactory;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.CreateChocolat;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.fabrica.Fabrica;
import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.fabrica.BountyesFactory;

public class Main {
    public static void main(String[] args) {
        ChocolateBar chocolateBar = Fabrica.FactoryForCreatingChocolateBars("Milky-Way");
        chocolateBar.ReleaseAChocolateBar();
        ChocolateBar chocolateBar1 = Fabrica.FactoryForCreatingChocolateBars("Snickers");
        chocolateBar1.ReleaseAChocolateBar();
        ChocolateBar chocolateBar2 = Fabrica.FactoryForCreatingChocolateBars("Bounty");
        chocolateBar2.ReleaseAChocolateBar();

        System.out.println("-".repeat(20));

        CreateChocolat createChocolat = new BountyesFactory();
        ChocolateBar bountyFactory = createChocolat.createChocolateBar();
        CandyBarFactory candyBarFactory = createChocolat.createCandyBarFactory();
        candyBarFactory.WillReleaseABar(bountyFactory);

        System.out.println("-".repeat(20));

        CreateChocolat createChocolat1 = Fabrica.FactoryForCreatingChocolateBarsAndOll("Milky-Way");
        ChocolateBar chocolateBar3 = createChocolat1.createChocolateBar();
        CandyBarFactory candyBarFactory1 = createChocolat1.createCandyBarFactory();
        candyBarFactory1.WillReleaseABar(chocolateBar3);

        CreateChocolat createChocolat2 = Fabrica.FactoryForCreatingChocolateBarsAndOll("Snickers");
        ChocolateBar chocolateBar4 = createChocolat2.createChocolateBar();
        CandyBarFactory candyBarFactory2 = createChocolat2.createCandyBarFactory();
        candyBarFactory2.WillReleaseABar(chocolateBar4);

        CreateChocolat createChocolat3 = Fabrica.FactoryForCreatingChocolateBarsAndOll("Bounty");
        ChocolateBar chocolateBar5 = createChocolat3.createChocolateBar();
        CandyBarFactory candyBarFactory3 = createChocolat3.createCandyBarFactory();
        candyBarFactory3.WillReleaseABar(chocolateBar5);





    }

}
