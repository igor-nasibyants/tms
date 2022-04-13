package com.tms.homework.artsiom.vladykouski.task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 public final class PhoneNumber <T> {
    private String number;

    private List <PhoneNumber> phone = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

     public void setNumber(String number) {
         this.number = number;
         number = sc.next(" ");
     }

     public void setPhone(List<PhoneNumber> phone) {
         this.phone = phone;
     }

     public void setSc(Scanner sc) {
         this.sc = sc;
     }

     public PhoneNumber(String number) {
         this.number = number;

     }


}
