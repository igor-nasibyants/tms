package by.astakhnovich.patterns.generating.builder.components;

public class Body {
    private boolean flag = false;

    public Body(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return flag ? "Body added" : "Body not added";
    }
}
