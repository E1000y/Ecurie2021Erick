package com.domain;

public class Horse {
    private int id;

    private String horseName;
    public Horse(int id, String horseName) {
        this.id = id;
        this.horseName = horseName;
    }

    public String getHorseName() {
        return horseName;
    }

    public int getId() {
        return id;
    }
}
