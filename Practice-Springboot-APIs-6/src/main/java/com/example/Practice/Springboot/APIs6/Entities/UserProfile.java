package com.example.Practice.Springboot.APIs6.Entities;

public class UserProfile {
    private int userId;
    private int phoneNumber;
    private String address;

    public UserProfile(int userId, int phoneNumber, String address) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
