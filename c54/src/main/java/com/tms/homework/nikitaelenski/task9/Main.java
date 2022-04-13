package com.tms.homework.nikitaelenski.task9;

import com.tms.homework.nikitaelenski.task9.offline.OfflineShop;
import com.tms.homework.nikitaelenski.task9.online.OnlineShop;

public class Main {
    public static void main(String[] args) {

        OnlineShop shopCar = new OnlineShop("http//CarShop.com" , 33 , 12 ,
                "Россия " , 14);
        System.out.println(shopCar.getAdress());



        OnlineShop shopEat = new OnlineShop("http//CarShop.com" , 33 , 12 ,
                "Беларусь" , 14);
        shopEat.addressСorrection();



        OfflineShop shopMila = new OfflineShop("Ул.Пушкина , дом Калатушкина ",
                40 , 5,"Россия" , 14.12,"Открыто");
        shopMila.Clining();


        OfflineShop shopOstrov = new OfflineShop("Ул.Пушкина , дом Калатушкина ",
                40 , 5,"Россия" , 20.12,"Закрыто");
        shopOstrov.Clining();
    }

}
