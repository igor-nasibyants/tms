package by.astakhnovich.patterns.generating.singleton;

public class Entity {
    private static Entity instance;
    private String value;

    private Entity(String name) {
        this.value = name;
    }

    public static Entity getInstance(String value) {
        if (instance == null) {
            instance = new Entity(value);
        }
        return instance;
    }
}
