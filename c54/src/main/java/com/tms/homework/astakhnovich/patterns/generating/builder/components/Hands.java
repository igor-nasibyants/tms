package by.astakhnovich.patterns.generating.builder.components;

public class Hands {
    private boolean flag = false;

    public Hands(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return flag ? "Hands added" : "Hands not added";
    }
}
