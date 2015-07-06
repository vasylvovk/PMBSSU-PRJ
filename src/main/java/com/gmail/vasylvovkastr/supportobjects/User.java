package com.gmail.vasylvovkastr.supportobjects;

public class User {

    private String userName;

    private UserType userType;

    public User() {
        this.userName = "guest";
        this.userType = UserType.GUEST;
    }

    public String getUserName() {
        return userName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
