package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vehicle {

    private String carName;
    private int normalSpeed;


    Car() {
        normalSpeed = generateSpeed();
        speed = normalSpeed;
        carName = generateCarName();
    }

    String getCarName() {
        return carName;
    }

    private String generateCarName() {
        List<String> carNamePool = new ArrayList<>(Arrays.asList("Buffalo", "Roamer", "Utopia", "Phantom", "Pyre",
                "Treasure", "Paragon", "Hero", "Pulse", "Centaur", "Desire", "Bliss", "Gallop", "Crown", "Passion", "Daydream",
                "Adventure", "Blade", "Surge", "Stardust"));
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(carNamePool.get(r.nextInt(20)));
        sb.append(" ");
        sb.append(carNamePool.get(r.nextInt(20)));
        return sb.toString();
    }

    private int generateSpeed() {
        Random r = new Random();
        speed = r.nextInt(31) + 80;
        return speed;
    }

    void prepareForLap(Race race) {
        if (race.isThereBrokenTruck()) {
            speed = 75;
        } else {
            speed = normalSpeed;
        }
        System.out.println(carName + "'s speed: " + speed);
    }

}