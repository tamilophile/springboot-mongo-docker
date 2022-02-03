package com.example.mongo.data.demo;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    public String id;
    private String name;
    public User(){

    }
    public User(String name){
        this(null,name);
    }
    public User(String id, String name){
        this.id=id;
        this.name=name;

    }
}
