package com.example.complaint_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserReg")

public class User {


    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private String address ;
    private String email ;
    private String mobile ;
    private String username ;
    private String password ;

    public User() {
    }

    public User(int id, String name, String address, String email, String mobile, String username, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
