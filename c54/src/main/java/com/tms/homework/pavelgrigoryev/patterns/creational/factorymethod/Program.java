package com.tms.homework.pavelgrigoryev.patterns.creational.factorymethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory1 = createDeveloperBySpecialty("php");
        Developer developer1 = developerFactory1.createDeveloper();

        developer1.writeCode();

        DeveloperFactory developerFactory2 = createDeveloperBySpecialty("java");
        Developer developer2 = developerFactory2.createDeveloper();

        developer2.writeCode();

        DeveloperFactory developerFactory3 = createDeveloperBySpecialty("c++");
        Developer developer3 = developerFactory3.createDeveloper();

        developer3.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
