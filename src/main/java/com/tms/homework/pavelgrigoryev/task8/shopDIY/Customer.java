package com.tms.homework.pavelgrigoryev.task8.shopDIY;

public class Customer extends Human{

    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public void lunch() {
        System.out.println("Чавкает, пускает слюни на товар!");
    }
    public void pay(){
        System.out.println("Покупатель " + getName() + " " + getAge() + " лет(года) " + " отдаёт последние деньги магазину и идёт дурить мозги Алексею ");
    }
}
