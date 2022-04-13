package com.tms.homework.han.task11.task4;

import java.util.Arrays;

public class GetView {
    int[] arr;

    public GetView(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        Arrays.sort(arr);
        StringBuilder array = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                array.append(arr[i]).append(" < ");
            } else {
                array.append(arr[i]);
            }
        }
        return array.toString();
    }
}
