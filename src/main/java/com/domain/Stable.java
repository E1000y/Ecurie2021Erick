package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private int id;

    private String stableName;
    private List<Horse> horses = new ArrayList<>();
    public Stable(int id, String stableName) {
        this.id = id;
        this.stableName = stableName;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);

    }

    public boolean containsHorse(Horse horse) {

        for (Horse h : horses) {
            if ((h.getHorseName().equals(horse.getHorseName()))
                    && (h.getId() == horse.getId())) {
                return true;
            }
        }

        return false;
    }
  //  boolean isExist = horses.stream().anyMatch(horse -> horse.getHorseName().contains());

    public int getId() {
        return id;
    }
}
