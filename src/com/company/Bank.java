package com.company;

public class Bank {
    private User[] users;
    public Bank(User[] users){
        setUsers(users);
    }
    public Bank(){
    }
    public void setUsers(User[] users){
        this.users = users;
    }
    public User[] getUsers(){
        return users;
    }


}
