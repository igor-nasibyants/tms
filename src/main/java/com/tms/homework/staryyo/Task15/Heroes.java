package com.tms.homework.staryyo.Task15;
import java.util.Objects;
import java.util.Optional;


public class Heroes {
   private final String name;
   private final Integer power;
   private final String comlexity;

   public Heroes(String name, Integer power, String comlexity){
       this.name;
       this.power;
       this.comlexity;
   }
   public String getComlexity(){return name ;}
   public String getName(){return comlexity;}
   public Integer getPower(){return power;}
   @Override
    public String toString(){return name + "-" power + "-" + comlexity;}


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, comlexity);
    }
}



