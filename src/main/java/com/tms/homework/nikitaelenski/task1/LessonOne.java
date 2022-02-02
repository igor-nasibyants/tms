package com.tms.homework.nikitaelenski.task1;

public class LessonOne {
    public static void  EvenNumbers(){
        int[] Arr = new int[10];
        for(int i=2,b=0;i<=20;i++){
            if(i%2==0){
                Arr[b]=i;
                System.out.print(Arr[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int s=0;s<Arr.length;s++){
            System.out.println(Arr[s]+" ");
        }
    }
    public static void  OddNumbers(){
        int num=0;
        for(int i=1;i<=99;i++){
            if(i%2==1);
                num++;
        }
        int[] arrays = new int [num];
        for(int u = 1 , v = 0 ; u<=99 ; u++){
            if (u%2==1){
                arrays[v] = u;
                System.out.print(arrays[v] + " ");
            }
        }
        System.out.print(" ");
        for(int u = 99 , v = 0 ; u>=1 ; u--) {
            if (u % 2 == 1) {
                arrays[v] = u;
                System.out.print(arrays[v] + " ");
            }
        }

    }
}
