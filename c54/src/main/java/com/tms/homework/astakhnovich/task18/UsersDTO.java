package com.tms.homework.astakhnovich.task18;

import com.tms.homework.astakhnovich.task17.User;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class UsersDTO implements Serializable {

    @XmlElementWrapper(name="users")
    @XmlElement(name="user")
    private List<User> userList;

    public UsersDTO() {}

    public UsersDTO(List<User> userList) {
        this.userList = userList;
    }
}
