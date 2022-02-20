package com.company;

public class User {
    private String surname;
    private String name;
    private String number;
    private int id;
    private String password;
    public User(String  surname, String name, String number, String password){
        setSurname(surname);
        setName(name);
        setNumber(number);
        setId(id);
        setPassword(password);
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "ID: " + getId() +"\n"+"SURNAME: " + getSurname() +"\n"+"NAME: "
                + getName() +"\n"+"NUMBER: " + getNumber() +"\n" + "PASSWORD: " + getPassword();
    }
}
