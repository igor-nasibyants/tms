package com.tms.homework.nikitaelenski.task7;

public class Main {
    public static void main(String[] args) {
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog(66 , "Хлеб" , "Дродж");
        myDogs[1] = new Dog(30 , "Мясо" , "Фред");
        myDogs[2] = new Dog(14 , "Овощи" , "Барт");
        System.out.print("имя последней собаки - ");
        System.out.println(myDogs[2].name);
        for( int x = 0 ; x < myDogs.length ; x ++){
            myDogs[x].bark();
        }

    }
}
