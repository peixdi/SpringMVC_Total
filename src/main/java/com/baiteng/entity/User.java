package com.baiteng.entity;

/**
 * Created by Admin on 2017/6/12.
 */
public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String password, String uername) {
        this.password = password;
        this.username = uername;
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

    @Override
    public String toString() {
        return "User{" +
                "uername='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
