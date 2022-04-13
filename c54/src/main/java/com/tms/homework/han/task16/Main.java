package com.tms.homework.han.task16;

import static com.tms.homework.han.task16.BigArr.getBigArr;
import static com.tms.homework.han.task16.CommonWord.commonWord;
import static com.tms.homework.han.task16.EvenNumbers.getEvenNumbers;
import static com.tms.homework.han.task16.IncreasingArray.isIncreasingArr;
import static com.tms.homework.han.task16.Numbers.getNumbers;
import static com.tms.homework.han.task16.Numbers.getRandomNumber;
import static com.tms.homework.han.task16.OddNumber.getOddNumber;
import static com.tms.homework.han.task16.TwentyRandomNumbers.getTwentyRandomNumbers;

public class Main {
    public static void main(String[] args) {
        commonWord("Hello my my name hello world transparent hello look");
        System.out.println("Even numbers");
        getEvenNumbers(getNumbers(20));
        System.out.println("Odd numbers");
        getOddNumber(getNumbers(99));
        System.out.println("Get 20 random numbers");
        getTwentyRandomNumbers(getRandomNumber(20, 20));
        System.out.println("Get BigArr");
        getBigArr(getRandomNumber(5, 15), getRandomNumber(5, 15));
        System.out.println("Is it increasing array?");
        System.out.println("\n" + isIncreasingArr(getRandomNumber(2, 10)));
    }
}
