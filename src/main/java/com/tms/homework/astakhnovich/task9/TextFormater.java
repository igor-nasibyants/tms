package com.tms.homework.astakhnovich.task9;

import com.tms.task.task10.theoryMaterial.StringBuilderClass;

import java.util.ArrayList;
import java.util.List;

public class TextFormater {

    public Integer numberOfWords(String str){
        String [] subStr = str.split("\\s");
        return subStr.length;
    }

    public boolean presenceOfPalindrome(String str){
        boolean flag = false;
        String[] subStr = str.split("\\s");
        for (String strings : subStr) {
            StringBuilder reverseStringBuilder = new StringBuilder(strings).reverse();
            String reverseString = String.valueOf(reverseStringBuilder);
            if(reverseString.equals(strings)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
