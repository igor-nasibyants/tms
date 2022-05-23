package com.tms.homework.nikitaelenski.task30.generative.factorymethod;

public class Program {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = creatDeveloper("С++");
        Developer developer1 = developerFactory.CreatDeveloper();
        developer1.writeCode();
        DeveloperFactory developejava = creatDeveloper("java");
        Developer developer = developejava.CreatDeveloper();
        developer.writeCode();
        DeveloperFactory developerFactory1 = creatDeveloper("Php");
        Developer developer2 = developerFactory1.CreatDeveloper();
        developer2.writeCode();
    }

    static DeveloperFactory creatDeveloper(String speciality){
            if(speciality.equalsIgnoreCase("java")){
                return new JavaDeveloperFactory();
            } else if (speciality.equalsIgnoreCase("С++")) {
                return new CppDeveloperFActory();
            } else if (speciality.equalsIgnoreCase("Php")) {
                return new PhpDeveloperFactory();
            }else {
                throw new RuntimeException(speciality + " Нету");
            }
    }
}
