package com.app.hedgehog.clientapp.model;

/**
 * Created by hedgehogus on 04.02.2017.
 */

public class User {

    private String login;

    private String pass;
    private String name;
    private String secondName;
    private String phoneNumber;
    private int attendanceQuantity;
    private int availableBonus;
    private String dateOfRegistration;

    public User(){}
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAttendanceQuantity() {
        return attendanceQuantity;
    }

    public void setAttendanceQuantity(int attendanceQuantity) {
        this.attendanceQuantity = attendanceQuantity;
    }

    public int getAvailableBonus() {
        return availableBonus;
    }

    public void setAvailableBonus(int availableBonus) {
        this.availableBonus = availableBonus;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }




}
