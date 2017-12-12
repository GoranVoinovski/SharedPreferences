package com.example.goran.sharedpreferences;

/**
 * Created by goran on 12.12.17.
 */

public class User {

    private String name;
    private String lastname;
    private String age;
    private boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public User(String name, String lastname, String age, boolean isMale) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.isMale = isMale;



    }
}
