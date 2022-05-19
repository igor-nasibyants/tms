package com.tms.task.patterns.creational.abstractfactory;

class EducationLoan extends Loan {
    public void getInterestRate(double r) {
        rate = r;
    }
}