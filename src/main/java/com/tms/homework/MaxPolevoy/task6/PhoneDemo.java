package com.tms.homework.MaxPolevoy.task6;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        Phone Samsung = new Phone();

        iPhone.model = "13 Pro";
        iPhone.year = "2021";
        iPhone.price = 3600;
        iPhone.number = "+375292222222";

        Samsung.model = "Galaxy S21 ";
        Samsung.year = "2021";
        Samsung.price = 3200;
        Samsung.number = "+375291111111";

        System.out.println(iPhone.model);
        System.out.println(iPhone.year);
        System.out.println(iPhone.price + "BYN");
        System.out.println(iPhone.number);
        System.out.println(iPhone.getNumber());

        System.out.println(Samsung.model);
        System.out.println(Samsung.year);
        System.out.println(Samsung.price + "BYN");
        System.out.println(Samsung.number);
        System.out.println(Samsung.getNumber());

        iPhone.receiveCall("Mam");
        Samsung.receiveCall("Dad");
    }
}
