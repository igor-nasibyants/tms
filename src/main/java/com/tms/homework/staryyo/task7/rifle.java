package com.tms.homework.staryyo.task7;

public class rifle extends assaultrifle{
    public rifletype rifletype;
    private String Name;
    private int calibr;
    private int year;
    public rifle(String Name, int calibr, int year){
        this.year = year;
        this.Name = Name;
        this.calibr = calibr;
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void defeatedTheEnemy() {
        super.defeatedTheEnemy();
    }
    public String toString(){
        return "rifle" + Name + "" + calibr + "" + year;
    }
}
