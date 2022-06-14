package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chocolatFactory;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.newAbstarctfactory.chokolatInterface.ChocolateBar;

public class Snikers implements ChocolateBar {
    @Override
    public void ReleaseAChocolateBar() {
        System.out.println("Делаем сникерс");
    }
}
