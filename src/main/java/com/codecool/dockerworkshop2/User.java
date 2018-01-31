package com.codecool.dockerworkshop2;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myusers")
public class User {

    @Id
    private Integer id;

    private String name;


    public void setName(String name) {
        this.name = name;
    }
}
