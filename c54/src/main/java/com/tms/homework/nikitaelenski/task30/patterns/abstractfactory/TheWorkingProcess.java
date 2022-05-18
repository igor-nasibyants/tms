package com.tms.homework.nikitaelenski.task30.patterns.abstractfactory;

public interface TheWorkingProcess {
    DrawingDesigner getDrawingDesigner();
    Worker getWorker();
    PersonnelDepartment getPersonnelDepartment();
    Accountant getAccountant();

}
