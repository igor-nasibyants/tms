package by.astakhnovich.patterns.generating.builder.components;

public class Head {
    private boolean flag = false;

    public Head(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return flag ? "Head added" : "Head not added";
    }
}
