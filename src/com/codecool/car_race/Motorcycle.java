package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle{

    private int speed;
    private String name;

    private static int motorcycleNumber = 1;

    Motorcycle() {
        speed = 100;
        name = generateMotorName();
        motorcycleNumber++;
    }

    String getName() {
        return name;
    }

    private String generateMotorName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorcycle ");
        sb.append(motorcycleNumber);
        return sb.toString();
    }

    void prepareForLap(Race race) {
        if (race.isItRaining()) {
            Random r = new Random();
            speed = speed - (r.nextInt(45)+5);
        }
        System.out.println("set " + name + "'s speed to: " + speed);
        }
    }
}
