package com.tms.task.task6;

public class Point {

    private int x = 10;
    private int y = 123;
    private boolean flag;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.flag = true;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        this.flag = Boolean.TRUE;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
