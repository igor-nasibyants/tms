package com.tms.homework.pavelgrigoryev.task17;

import com.tms.homework.pavelgrigoryev.task16.Streams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex extends Streams {
    public static void main(String[] args) {
        sep();
        match();
        sep();
        find();
        sep();
        replace();
        sep();
        split();
        sep();
    }

    private static void split() {
        String text = "Hi Julia! How are you? Is this your stinky socks?";
        Pattern pattern = Pattern.compile("[ ,.!?]");
        String[] words = pattern.split(text);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void replace() {
        String text = "FishDog ! SunriseDog ! SmallDog ! SnoopDog ! AlphaBetaDog! AliceDog";
        Pattern pattern = Pattern.compile("Dog(\\w*)");
        Matcher matcher = pattern.matcher(text);
        System.out.println(text);
        System.out.println(matcher.replaceAll("Cat"));
    }

    private static void find() {
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher = pattern.matcher("Dimas email is dimail@mail.by");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group());
        }
        System.out.println();
    }

    private static void match() {
        String phoneNumber = "+375292559511";
        boolean result = phoneNumber.matches("(\\+*)\\d{12}");

        if (result) {
            System.out.println("It is a phone number : " + phoneNumber);
        } else {
            System.err.println("It is not a phone number !");
        }
    }
}
