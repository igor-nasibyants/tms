package com.tms.homework.max.polevoy.task7.interfaceImplementationMore;

//Один класс может реализовать любое количество интерфейсов.
public class Pickup implements CargoAuto, PassengersAuto {
    public void transportCargo() {
        System.out.println("Везу груз");
    }

    public void transportPassengers() {

        System.out.println("Везу пассажиров");
    }
}