package com.tms.homework.nikitaelenski.task14;

import com.tms.homework.astakhnovich.task6.Human;

public class Houses implements Comparable<Houses>{
    private Integer id ;
    private double height;
    private Integer umberOfFloors;
    private Integer numberOfApartments;
    private String address;


    public Houses(Integer id, double height, Integer umberOfFloors, Integer numberOfApartments, String address) {
        this.id = id;
        this.height = height;
        this.umberOfFloors = umberOfFloors;
        this.numberOfApartments = numberOfApartments;
        this.address = address;
    }
    public Integer getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getUmberOfFloors() {
        return umberOfFloors;
    }

    public void setUmberOfFloors(Integer umberOfFloors) {
        this.umberOfFloors = umberOfFloors;
    }

    public Integer getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(Integer numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public int compareTo(Houses o) {
        if (this.getAddress().equals(o.getAddress())) {
            return o.getNumberOfApartments() - this.getNumberOfApartments();
        } else {
            return this.getAddress().compareTo(o.getAddress());
        }
    }



    @Override
    public String toString() {
        return "Houses" +
                "id= " + id +
                ", height= " + height +
                ", umberOfFloors= " + umberOfFloors +
                ", numberOfApartments= " + numberOfApartments +
                ", address='" + address + '\'';
    }
}
