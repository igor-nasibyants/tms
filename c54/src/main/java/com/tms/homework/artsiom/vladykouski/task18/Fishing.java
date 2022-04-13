package com.tms.homework.artsiom.vladykouski.task18;

import com.sun.xml.txw2.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.List;

@XmlType (propOrder = {"rods","aromatic","hooks", "tourism"}, name = "fishing")
    @XmlRootElement
    public class Fishing {
    private String rods;
    private String aromatic;
    private String hooks;
    private Tourism tourism;

    public Fishing() {
    }

    public Tourism getTourism() {
        return tourism;
    }

    public void setTourism(Tourism tourism) {
        this.tourism = tourism;
    }

    public String getRods() {
        return rods;
    }

    public void setRods(String rods) {
        this.rods = rods;
    }

    public String getAromatic() {
        return aromatic;
    }

    public void setAromatic(String aromatic) {
        this.aromatic = aromatic;
    }

    public String getHooks() {
        return hooks;
    }

    public void setHooks(String hooks) {
        this.hooks = hooks;
    }

    public Fishing(String rods, String aromatic, String hooks, Tourism tourism) {
        this.rods = rods;
        this.aromatic = aromatic;
        this.hooks = hooks;
        this.tourism = tourism;
    }
}
