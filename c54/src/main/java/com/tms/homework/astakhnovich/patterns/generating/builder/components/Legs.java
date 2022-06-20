package by.astakhnovich.patterns.generating.builder.components;

public class Legs {
    private boolean flag = false;

    public Legs(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return flag ? "Legs added" : "Legs not added";
    }
}

