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
        String[] strings = str.split("\\s");
        StringBuilder reverseStringBuilder = new StringBuilder();
        for (String st : strings) {
            reverseStringBuilder.append(st).reverse();
            String reverseString = reverseStringBuilder.toString();
            if(reverseString.equals(st)){
                flag = true;
                break;
            }
            reverseStringBuilder.delete(0, reverseString.length()-1);
        }
        return flag;
    }
}
