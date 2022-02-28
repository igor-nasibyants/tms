package com.tms.homework.han.task10.task4;

public class Main extends TextFormatter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lorem ipsum dolor sit amet       ,      ")
                .append(" consectetur       :    adipiscing elit       .   ")
                .append(" Nunc      eleifend pop     nibh       =  sed  +      imperdiet cursus. ")
                .append(" Cras   *  ultrices non arcu.")
                .append(" Suspendisse ?  ut         ornare lorem       . ")
                .append("   Morbi  varius te llus    , sed   :   diam      egestas fringilla.")
                .append("  Morbius    &         -    is a living     vampire, very much alive    .    ")
                .append("       Deadpool  sees   everything   #  look @ ! say ^ AAAAAHHHH.")
                .append(" first second,   third");
        System.out.println(getNumberLines(String.valueOf(sb)));
    }
}
