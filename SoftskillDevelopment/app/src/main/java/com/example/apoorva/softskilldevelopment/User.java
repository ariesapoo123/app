package com.example.apoorva.softskilldevelopment;

/**
 * Created by apoorva on 15-06-2018.
 */

public class User {
    private String Name, Password;

    public User(){}


    public User(String name, String password) {
        Name = name;

        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
