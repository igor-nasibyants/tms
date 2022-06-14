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

    static DeveloperFactory creatDeveloper(String speciality){switch ( speciality){
            case "java" : return new JavaDeveloperFactory();
            case "С++" : return new CppDeveloperFActory();
            case "Php" : return new PhpDeveloperFactory();
            default:return null;
        }

    }
}
