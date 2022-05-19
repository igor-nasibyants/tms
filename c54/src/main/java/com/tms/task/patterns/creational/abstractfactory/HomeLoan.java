package com.tms.task.patterns.creational.abstractfactory;

class HomeLoan extends Loan {
    public void getInterestRate(double r) {
        rate = r;
    }
}