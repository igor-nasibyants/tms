package com.tms.task.patterns.creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Prototype {

    Prototype getClone();

}

class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord() {
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord() {

        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    @Override
    public Prototype getClone() {

        return new EmployeeRecord(id, name, designation, salary, address);
    }
}

class PrototypeDemo {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");


        System.out.print("Enter Employee Name: ");
        String ename = br.readLine();
        System.out.print("\n");


        System.out.print("Enter Employee Designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");


        System.out.print("Enter Employee Address: ");
        String eaddress = br.readLine();
        System.out.print("\n");


        System.out.print("Enter Employee Salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();

        e2.showRecord();
    }
}//End of the ProtoypeDemo class.
