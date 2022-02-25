package com.tms.homework.astakhnovich.task9;

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
            reverseStringBuilder.delete(0, reverseString.length());
        }
        return flag;
    }
}
