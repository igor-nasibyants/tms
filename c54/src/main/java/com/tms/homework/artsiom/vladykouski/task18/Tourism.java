package com.tms.homework.artsiom.vladykouski.task18;

import com.sun.xml.txw2.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.List;


@XmlType(propOrder = {"tent", "beer", "barbeque"}, name = "Tourism")
    public class Tourism {
        private String  tent;
        private String beer;
        private String barbeque;

    public Tourism(String tent, String beer, String barbeque) {
        this.tent = tent;
        this.beer = beer;
        this.barbeque = barbeque;
    }

    public String getTent() {
        return tent;
    }

    public void setTent(String tent) {
        this.tent = tent;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    public String getBarbeque() {
        return barbeque;
    }

    public void setBarbeque(String barbeque) {
        this.barbeque = barbeque;
    }
}
