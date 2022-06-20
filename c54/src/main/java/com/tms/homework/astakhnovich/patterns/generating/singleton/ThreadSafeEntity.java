package by.astakhnovich.patterns.generating.singleton;

public class ThreadSafeEntity {
    private static volatile ThreadSafeEntity instance;
    private String value;

    private ThreadSafeEntity(String value) {
        this.value = value;
    }

    public static ThreadSafeEntity getInstance(String value) {
        if (instance != null) {
            return instance;
        }
        synchronized (ThreadSafeEntity.class) {
            if (instance == null) {
                instance = new ThreadSafeEntity(value);
            }
            return instance;
        }
    }
}