package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private int id;
    private String stableName;
    private List horses = new ArrayList();

    public Stable(int id, String stableName) {
        this.id = id;
        this.stableName = stableName;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);

    }

    public boolean containsHorse(Horse horse) {
        return horses.contains(horse);
    }
}
