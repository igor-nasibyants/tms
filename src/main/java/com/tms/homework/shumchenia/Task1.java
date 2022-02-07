package com.tms.homework.shumchenia;

public class Task1{

    public static void main(String[] args) {
        char[][] array =new char[8][8];
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length;j++){
                if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)){
                    array[i][j]='#';
                }
                else{
                    array[i][j]='@';
                }
            }
        }
        for (char[] chars : array) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(chars[j]);
            }
        }

    }
}
/*
*    123456789
 * 1 *#*#*#*#*
 * 2 #*#*#*#*#
 * 3 *#*#*#*#*
 * 4 #*#*#*#*#
 * 5 *#*#*#*#*
 * 6 #*#*#*#*#
 * 7 *#*#*#*#*
 * 8 #*#*#*#*#
 * 9 *#*#*#*#*
* */