package com.tms.homework.astakhnovich.task1to19.task14;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class LocalDateExample {
    private LocalTime presentTime;

    public static void main(String[] args) {
        LocalDateExample l = new LocalDateExample();
//        l.localTimeExample();
//        l.cycleForTenSeconds();
    }

    public void localTimeExample(){
        List<LocalTime> list = new ArrayList<>();
        list.add(timeNow());
        int a = 0;
        for (int i = 0; i<=1000000; i++){
            a = a+a;
        }
        list.add(timeNow());
        list.forEach(System.out::println);
    }

    public void cycleForTenSeconds(){
        int presentTimeSecPlusTenSec = getPresentTimeSec()+10;
        long i = 0;
        while (presentTimeSecPlusTenSec != getPresentTimeSec()){
            i++;
        }
    }

    public LocalTime timeNow(){
        return presentTime = LocalTime.now();
    }

    public int getPresentTimeSec() {
        return timeNow().getSecond();
    }
}