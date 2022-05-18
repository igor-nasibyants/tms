package com.tms.homework.nikitaelenski.task30.patterns.abstractfactory;

import com.tms.homework.nikitaelenski.task30.patterns.abstractfactory.plantMAZ.MAZWorkingProcess;

public class Main {
    public static void main(String[] args) {
        TheWorkingProcess theWorkingProcess= new MAZWorkingProcess();
        Accountant accountant = theWorkingProcess.getAccountant();
        DrawingDesigner drawingDesigner = theWorkingProcess.getDrawingDesigner();
        PersonnelDepartment personnelDepartment = theWorkingProcess.getPersonnelDepartment();
        Worker worker = theWorkingProcess.getWorker();

        System.out.println("8:00 начало работы");
        worker.collectsFromBlueprints();
        drawingDesigner.drawsADiagram();
        accountant.transfersSalary();

        personnelDepartment.firesAnEmployee();

    }
}
