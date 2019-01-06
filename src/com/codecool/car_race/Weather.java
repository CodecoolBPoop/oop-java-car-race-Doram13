package com.codecool.car_race;
import java.util.Random;

public class Weather {
    private boolean isRaining;

    Weather() {
        setRaining();
    }

    public boolean getRain() {
        return isRaining;
    }

    void setRaining() {
        Random r = new Random();
        isRaining = false;
        if (r.nextDouble() <= 0.3)
            isRaining = true;
    }
}
