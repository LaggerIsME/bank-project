package com.company;

public class Validator {

    public boolean checker(User user, User[] users){
        for (User value : users) {
            if (user.getName().equals(value.getName()) &&
                    user.getSurname().equals(value.getSurname()) &&
                    user.getNumber().equals(value.getNumber()) &&
                    user.getPassword().equals(value.getPassword())
            ) {
                return true;
            }
        }
        return false;
    }
}
