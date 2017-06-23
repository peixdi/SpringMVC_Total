package com.baiteng.entity;

/**
 * Created by Admin on 2017/6/12.
 */
public class User2 {
    private String username;
    private String gender;
    private String hobby;
    private String address;

    public User2() {
    }

    public User2(String username, String gender, String hobby, String address) {
        this.username = username;
        this.gender = gender;
        this.hobby = hobby;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Override
//    public String toString() {
//        return "User2{" +
//                "username='" + username + '\'' +
//                ", gender='" + gender + '\'' +
//                ", hobby='" + hobby + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
