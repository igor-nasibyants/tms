package com.tms.homework.han.task14;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Cat implements Comparable<Cat>, Comparator<Cat> {
    private final Integer id;
    private final Integer age;
    private final String name;

    public Cat(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Cat() {
        this(null, null, null);
    }

    @Override
    public String toString() {
        return "Cat " + name + " has " + age + " year";
    }

    public Integer getAge() {
        return Optional.ofNullable(age).orElse(-1);
    }

    public String getName() {
        return Optional.ofNullable(name).orElse("Non");
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return 0;
    }

    @Override
    public Comparator<Cat> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Cat> thenComparing(Comparator<? super Cat> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Cat> thenComparing(Function<? super Cat, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Cat> thenComparing(Function<? super Cat, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Cat> thenComparingInt(ToIntFunction<? super Cat> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Cat> thenComparingLong(ToLongFunction<? super Cat> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Cat> thenComparingDouble(ToDoubleFunction<? super Cat> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
