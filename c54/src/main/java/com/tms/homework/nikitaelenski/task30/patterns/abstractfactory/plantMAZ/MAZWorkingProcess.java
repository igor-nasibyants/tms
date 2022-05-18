package com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.*;

public class MAZWorkingProcess implements TheWorkingProcess {
    @Override
    public Worker getWorker() {
        return new Mechanic() {
        };
    }

    @Override
    public DrawingDesigner getDrawingDesigner() {
        return new ChiefDesigner();
    }


    @Override
    public PersonnelDepartment getPersonnelDepartment() {
        return new HumanResourcesDepartment();
    }

    @Override
    public Accountant getAccountant() {
        return new Salary();
    }
}
