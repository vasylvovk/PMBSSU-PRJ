package com.gmail.vasylvovkastr.supportobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "pkey")
    private int idUser;

    @Column(name = "name")
    private String userName;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "emeil")
    private String email;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "role")
    private String userType;

    public User() {
    }

    public User(
            int idUser, 
            String userName, 
            String login, 
            String password, 
            String email, 
            String telefon, 
            String userType
    ) {
        this.idUser = idUser;
        this.userName = userName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.telefon = telefon;
        this.userType = userType;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getUserType() {
        return userType;
    }
}
