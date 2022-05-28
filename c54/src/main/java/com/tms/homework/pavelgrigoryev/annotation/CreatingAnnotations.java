package com.tms.homework.pavelgrigoryev.annotation;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CreatingAnnotations {
    public static void main(String[] args) {

        Cat myCat = new Cat("OmegaDestroyer");
        myCat.meow();
        System.out.println(myCat);

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important :(");
        }

        Arrays.stream(myCat.getClass().getDeclaredMethods())
                .forEach(method -> {
                    if (method.isAnnotationPresent(RunImmediately.class)) {
                        try {
                            RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                            for (int i = 0; i < annotation.times(); i++) {
                                method.invoke(myCat);
                            }
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });

        Arrays.stream(myCat.getClass().getDeclaredFields())
                .forEach(field -> {
                    if (field.isAnnotationPresent(ImportantString.class)) {
                        try {
                            Object objectValue = field.get(myCat);
                            if (objectValue instanceof String stringValue) {
                                System.out.println(stringValue.toUpperCase());
                            }
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
    }
}
