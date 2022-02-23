package com.tms.homework.nikitaelenski.task9.offline;

import com.tms.homework.nikitaelenski.task9.Shop;

public class OfflineShop extends Shop {

    private final double timeClining;
    private final String openShop;
    public OfflineShop(String adress, Integer quantityGoods, Integer pruduktVariable, String salesMArket ,
                       double timeClining , String openShop) {
        super(adress, quantityGoods, pruduktVariable, salesMArket);
        this.timeClining = timeClining;
        this.openShop = openShop;
    }
    public void Clining(){
        if(openShop.equals("Открыто")){
            if(timeClining >= 10.00 && timeClining <= 20.00){
                System.out.println("Пожалуй нужно убрать");
            }else{
                System.out.println("Не сегодня");
            }
        }else{
            System.out.println("На сегодня мы закрыты ");
        }

    }


}
