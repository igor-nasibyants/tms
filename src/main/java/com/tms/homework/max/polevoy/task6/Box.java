package com.tms.homework.max.polevoy.task6;

public class Box {
    int width;
    int height;
    int depth;

    int getVolume() {
        return width * height * depth;
    }

    void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

}

