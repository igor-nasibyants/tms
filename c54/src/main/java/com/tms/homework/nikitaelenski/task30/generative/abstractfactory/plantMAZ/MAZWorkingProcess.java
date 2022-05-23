package com.tms.homework.nikitaelenski.task30.generative.abstractfactory.plantMAZ;

import com.tms.homework.nikitaelenski.task30.generative.abstractfactory.*;

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
