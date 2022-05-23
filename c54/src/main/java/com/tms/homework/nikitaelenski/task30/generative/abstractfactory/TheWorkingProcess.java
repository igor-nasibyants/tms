package com.tms.homework.nikitaelenski.task30.generative.abstractfactory;

public interface TheWorkingProcess {
    DrawingDesigner getDrawingDesigner();
    Worker getWorker();
    PersonnelDepartment getPersonnelDepartment();
    Accountant getAccountant();

}
