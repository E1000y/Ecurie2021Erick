package com.domain;

public class Horse {
    private int id;

    private String horseName;
    private int age;
    private Rider rider;
    private char gender;

    public Horse(int id, String horseName) {
        this.id = id;
        this.horseName = horseName;
    }

    public Horse(int id, String horseName, int age, Rider rider, char gender) {
        this.id = id;
        this.horseName = horseName;
        this.age = age;
        this.rider = rider;
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

    public Rider getRider() {
        return rider;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "id=" + id +
                ", horseName='" + horseName + '\'' +
                ", age=" + age +
                ", rider=" + rider +
                ", gender=" + gender +
                '}';
    }
}
