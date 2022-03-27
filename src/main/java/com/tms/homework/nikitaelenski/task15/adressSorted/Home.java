package com.tms.homework.nikitaelenski.task15.adressSorted;


public class Home  implements Comparable<Home>{
    private Integer id;
    private String address;

    public Home(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Home " +
                "id=" + id +
                ", address='" + address + '\'';
    }

    @Override
    public int compareTo(Home o) {
        if (this.getId()==(o.getId())) {
            return o.getId() - this.getId();
        } else {
            return this.getId().compareTo(o.getId());
        }

    }
}

