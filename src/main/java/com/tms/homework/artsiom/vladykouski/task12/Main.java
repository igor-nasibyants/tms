package com.tms.homework.artsiom.vladykouski.task12;
import com.tms.homework.han.task13.Collection;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.io.*;

public class Main extends Present implements BuyAble{
    @Override
    public  void buy() {
    }

    public Main(String flowers, String electronics, String parfums, String clothes) {
        super(flowers, electronics, parfums, clothes);
    }

    public static void main (String [] args) throws IOException {
        System.out.print("Введите произвольную стоимость товара четыре раза, на которую Вы бы смогли " +
                "потратится на 8 марта ");
        Present m = new Present("Розы", "Миксер", "Духи", "Халат");

        System.out.println(m);
        int i;
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(m.getCost1());
        arr.add(m.getCost2());
        arr.add(m.getCost3());
        arr.add(m.getCost4());

        for (i = 0; i <arr.size(); i++) {
            try {
                if (arr.get(i) > 100)
                    throw new CostExecption(arr.get(i));
                System.out.println("Стоимость товара в  " + arr.get(i) + "  рубля соответствует моему бюджету");

            }catch (CostExecption e){
                System.out.print(e);
            }
        }
        FileWriter outputStream = new FileWriter("E:\\ 8_march.txt");
        outputStream.write(String.valueOf(m));
        outputStream.write("Дальше по тексту перечисление рандомных стоимостей подарков");
        outputStream.close();

        OutputStream outputStream1 = new FileOutputStream("E:\\ 8_march_new.txt");
        outputStream1.write(m.getCost1());
        outputStream1.write(m.getCost2());
        outputStream1.write(m.getCost3());
        outputStream1.write(m.getCost4());
        outputStream1.close();
    }
}
