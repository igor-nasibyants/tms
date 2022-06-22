package com.tms.homework.astakhnovich.task17;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegExp {
    private List<User> userList;
    private static final String EMAIL_VALID = "\\w+([\\.-]?\\w+)*@(\\w{2,5}[\\.]\\w{2,3})";
    private static final String PASSWORD_VALID = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[\\w]{6,}";

    public static void main(String[] args) {
        RegExp re = new RegExp();
        re.checkUser();
    }

    public void createUser() {
        userList = new ArrayList<>();
        userList.add(new User(1, "Valera", "valera@mail.ru", "valera1998"));
        userList.add(new User(2, "Vlad", "Vlad1998@mail.ru", "Vlad"));
        userList.add(new User(3, "Maks", "Maks@gmail.com", "maksS1998"));
        userList.add(new User(4, "Ira", "ira.mail.ru", "viraa1998"));
        userList.add(new User(5, "Anya", "Anyamail.ru", "Anyamail"));
        userList.add(new User(6, "Olya", "Oly.54a@gmail.ru", "Olya32566"));
        userList.add(new User(7, "Grisha", "Grisha@mailru", "123456"));
        userList.add(new User(8, "Petya", "Petya@mail.ru", "Йцук123"));
        userList.add(new User(9, "Masha", "Masha@mail.ruu", "Qwer+123"));
        userList.add(new User(10, "Gena", "Gena@mail.ru", "Ййцуу123"));
        userList.add(new User(11, "Lolka", "lolka1576-13.lolka@apple.com", "lolk35aLOL1567"));
        userList.add(new User(12, "Katya", "Kat@gmail.com", "lolk35aLOL1567"));
    }

    public List<User> checkUser(){
        createUser();
        return userList.stream()
                .filter(a -> isValidEmail(a.getEmail()) && isValidPassword(a.getPassword()))
                .collect(Collectors.toList());
    }

    public boolean isValidEmail(String email){
        return Pattern.matches(EMAIL_VALID, email);
    }

    public static boolean isValidPassword(String password){
        return Pattern.matches(PASSWORD_VALID, password);
    }
}