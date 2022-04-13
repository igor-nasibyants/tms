package com.tms.task.task9;

class Calc {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return "" + (Double.parseDouble(a) + Double.parseDouble(b));
    }
}