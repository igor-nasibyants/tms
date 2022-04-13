package com.tms.homework.nikitaelenski.task11;

public class AddressReplacement {

    private static String Replace(String str ) throws Exception{
        if (str.endsWith("com")) {
            throw new Exception("Не корректный адрес : Произведите  замена символов");
        }
        String  Address = str.replace(".by",".com");
        return Address;
    }
    public static String Adress(String st){
        try {
            return Replace(st);
        } catch (Exception e) {
            return st.replace(".com",".by");
        }
    }
}
