package com.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Horse> horseFilteredByID = horses.stream().filter(horse1 -> horse1.getId() == horse.getId()).collect(Collectors.toList());
        return horseFilteredByID.size() != 0;
/*
        for (Horse h : horses) {
            if ((h.getHorseName().equals(horse.getHorseName()))
                    && (h.getId() == horse.getId())) {
                return true;
            }
        }

        return false;

 */
    }


    public int getId() {
        return id;
    }
}
