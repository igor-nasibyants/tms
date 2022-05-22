package com.tms.homework.han.patterns.structural.facade;

public class AccountWoW {
    public void receive() {
        System.out.println("Аккаунт получен");
    }
    public void payment() {
        System.out.println("За аккаунт заплатили");
    }

    public void sell() {
        System.out.println("Продается аккаунт с гоблинами");
    }
}
