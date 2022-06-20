package by.astakhnovich.patterns.generating.prototype;

import java.util.Objects;

public class Prototype implements Cloneable{
    private String value1;
    private String value2;
    private String value3;

    public Prototype(String value1, String value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public Prototype(Prototype target){
        this(target.getValue1(), target.getValue2(), target.getValue3());
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Prototype(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prototype prototype = (Prototype) o;
        return Objects.equals(getValue1(), prototype.getValue1()) && Objects.equals(getValue2(),
                prototype.getValue2()) && Objects.equals(getValue3(), prototype.getValue3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue1(), getValue2(), getValue3());
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                '}';
    }
}
