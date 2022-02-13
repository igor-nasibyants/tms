package com.tms.homework.nikitaelenski.task7;

 public class Dog {
     int size;
     String bread;
     String name;
    void bark(){
        if (size >  60 ){
            System.out.println("Гав! Гав! " + name);
        }else if (size > 20) {
            System.out.println("Вуф! Вуф! " + name);
        }else{
            System.out.println("Тяф! Тяф! " + name);
        }
    }


     public Dog(int size, String bread, String name) {
         this.size = size;
         this.bread = bread;
         this.name = name;
     }

     public Dog() {
         this.size = size;
         this.bread = bread;
         this.name = name;
     }

     @Override
     public String toString() {
         return "Dog{" +
                 "size=" + size +
                 ", bread='" + bread + '\'' +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
