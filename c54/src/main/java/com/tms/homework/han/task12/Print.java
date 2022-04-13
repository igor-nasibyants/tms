package com.tms.homework.han.task12;

import java.util.Arrays;
import java.util.Collection;

public class Print {
    public static String pFormat(Collection<?> c) {
        if (c.size() == 0)
            return "[]";
        StringBuilder result = new StringBuilder("[");
        for (Object element : c) {
            if (c.size() != 1) {
                result.append("\n");
            }
            result.append(element);
        }
        if (c.size() != 1) {
            result.append("\n");
        }
        result.append("]");
        return result.toString();
    }

    public static void pPrint(Object[] c) {
        System.out.println(pFormat(Arrays.asList(c)));
    }
}
