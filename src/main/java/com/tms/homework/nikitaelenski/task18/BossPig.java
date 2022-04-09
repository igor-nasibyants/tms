package com.tms.homework.nikitaelenski.task18;

import java.io.IOException;
import java.io.Reader;

public class BossPig extends Reader {
    private String pigName ;
    private String strength ;
    private Integer power ;

    public BossPig(String pigName, String strength, Integer power) {
        this.pigName = pigName;
        this.strength = strength;
        this.power = power;
    }

    public String getPigName() {
        return pigName;
    }

    public void setPigName(String pigName) {
        this.pigName = pigName;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
