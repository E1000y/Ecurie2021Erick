package com.domain;

public class Horse {
    private int id;

    private String horseName;
    private int age;
    private Cavalier cavalier;
    private char gender;

    public Horse(int id, String horseName) {
        this.id = id;
        this.horseName = horseName;
    }

    public Horse(int id, String horseName, int age, Cavalier cavalier, char gender) {
        this.id = id;
        this.horseName = horseName;
        this.age = age;
        this.cavalier = cavalier;
        this.gender = gender;
    }

    public String getHorseName() {
        return horseName;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
       
        return gender;
    }

    public int getAge() {
        return age;
    }
}
