package com.tms.homework.astakhnovich.task1to19.task17;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "User")
@XmlRootElement
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "(User: " +
                "id = " + id +
                ", name = " + name  +
                ", email = " + email  +
                ", password = " + password +
                ")";
    }
}