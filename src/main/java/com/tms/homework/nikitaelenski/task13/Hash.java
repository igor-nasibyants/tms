package com.tms.homework.nikitaelenski.task13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Hash {
    public static void main(String[] args) {
        Map<String , String> states = new HashMap<String , String>();
        states.put("1","Никита");
        states.put("2","Антон");
        states.put("3","Варя");
        states.put("4","Геннадий");
        Collection<String> values = states.values();

        states.forEach((key, value) -> System.out.println(value + " " + key));

        states.remove("2");
        states.replace("3","ххх");
        states.replace("5","qqq");
        System.out.println(" ");
        for(Map.Entry<String ,String> itemm : states.entrySet()){
            System.out.println(itemm.getValue() + " " + itemm.getKey());
        }
    }

}
