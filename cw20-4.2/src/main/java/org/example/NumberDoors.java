package org.example;

import java.util.Arrays;

public enum NumberDoors {
    TWO(2, "do"),
    FOUR(4, "chahar");


    private int numberOfDoors;
    private String title;


    public String getTitle() {
        return title;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    NumberDoors(int numberOfDoors, String title) {
        this.numberOfDoors = numberOfDoors;
        this.title = title;
    }


    public static NumberDoors passInt(Integer id) {
        return Arrays.stream(values())
                .parallel()
                .filter(value -> value.getNumberOfDoors() == id)
                .findFirst()
                .orElse(null);
    }

    public static NumberDoors passFinglish(String title) {
        return Arrays.stream(values())
                .parallel()
                .filter(value -> value.getTitle().equals(title))
                .findFirst().orElse(null);
    }


}
