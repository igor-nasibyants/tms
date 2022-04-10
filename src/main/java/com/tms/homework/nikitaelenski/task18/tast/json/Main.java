package com.tms.homework.nikitaelenski.task18.tast.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args){

        System.out.println(SomeDate());
 //     SomeDate();
        System.out.println(" ");
        SomeDateOne();
        System.out.println(" ");
        InnerObject();
        System.out.println(" ");
        reedValue();

    }
    public static String SomeDate(){
        ObjectMapper objectMapper = new ObjectMapper();
        SomeDate someDate = new SomeDate();

        someDate.setParam1(100);
        someDate.setParam2(true);
        someDate.setParam3("BoostBrain");

        try {
            String result = objectMapper.writeValueAsString(someDate);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static void SomeDateOne(){

        ObjectMapper objectMapper = new ObjectMapper();
        SomeDateOne someDateOne = new SomeDateOne();

        someDateOne.setArray(new int[]{1 ,2 ,3 ,4 ,5});
        someDateOne.setArray2(new String[]{"one","two","three","four","five"});

        try {
            String result = objectMapper.writeValueAsString(someDateOne);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void InnerObject(){
        ObjectMapper objectMapper = new ObjectMapper();
        InnerObject innerObject = new InnerObject();
        SomeDate someDate = new SomeDate();

        innerObject.setParam1(10);
        innerObject.setParam2(false);
        innerObject.setParam3("String");
        someDate.setInnerObject(innerObject);

        try {
            String result = objectMapper.writeValueAsString(someDate);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void reedValue() {
        ObjectMapper objectMapper = new ObjectMapper();
        InnerObject innerObject = new InnerObject();
        SomeDate someDate = new SomeDate();

        innerObject.setParam1(10);
        innerObject.setParam2(false);
        innerObject.setParam3("String");
        someDate.setInnerObject(innerObject);

        try {
            String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(someDate);
            System.out.println(result);
            SomeDate Date = objectMapper.readValue(result,SomeDate.class);
            System.out.println(Date);
            FileOutputStream fileOutputStream = new FileOutputStream("json//test.json");
            fileOutputStream.write(result.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

